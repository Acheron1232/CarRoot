package com.acheron.service.service;

import com.acheron.db.repository.BrandRepository;
import com.acheron.db.repository.ModelRepository;
import com.acheron.service.dto.BrandDto;
import com.acheron.service.dto.ModelDto;
import com.acheron.service.mapper.BrandMapper;
import com.acheron.service.mapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ModelService implements com.acheron.service.service.Service<ModelDto,Long> {
    @Autowired
    ModelRepository modelRepository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<ModelDto> findAll() {
        return modelRepository.findAll().stream().map(modelMapper::mapTo).toList();
    }

    @Override
    public Optional<ModelDto> findById(Long id) {
        return Optional.empty();
    }

    public List<ModelDto> findByBrandId(Long id) {
        return modelRepository.findModelsByBrandId(id).stream().map(modelMapper::mapTo).toList();
    }

    @Override
    public ModelDto save(ModelDto object) {
        return null;
    }

    @Override
    public ModelDto update(Long id, ModelDto object) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
