package com.acheron.service.service;

import com.acheron.db.repository.BrandRepository;
import com.acheron.service.dto.BrandDto;
import com.acheron.service.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class BrandService implements com.acheron.service.service.Service<BrandDto,Long> {

    @Autowired
    BrandMapper brandMapper;
    @Autowired
    BrandRepository brandRepository;

    @Override
    public List<BrandDto> findAll() {
        return brandRepository.findAll().stream().map(brandMapper::mapTo).toList();
    }

    @Override
    public Optional<BrandDto> findById(Long id) {
        return brandRepository.findById(id).map(brandMapper::mapTo);
    }

    @Override
    @Transactional
    public BrandDto save(BrandDto object) {
        return Optional.of(object).
                map(brandMapper::mapFrom).
                map(brandRepository::save).
                map(brandMapper::mapTo).
                orElseThrow();
    }

    @Transactional
    public BrandDto update(Long id,BrandDto object) {
        return brandRepository.findById(id).
                map(entity -> {entity.setName(object.getName());
                    entity.setImage(object.getImage());
                            return entity;
                        }
                ).
                map(brandRepository::saveAndFlush).
                map(brandMapper::mapTo).
                orElseThrow();
    }
    @Transactional
    @Override
    public boolean delete(Long id) {
        return brandRepository.findById(id).map(entity -> {brandRepository.delete(entity);
        brandRepository.flush();
        return true;}).
                orElse(false);
    }

}
