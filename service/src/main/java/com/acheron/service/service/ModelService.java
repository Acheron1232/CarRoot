package com.acheron.service.service;

import com.acheron.db.repository.BrandRepository;
import com.acheron.service.dto.BrandDto;
import com.acheron.service.dto.ModelDto;
import com.acheron.service.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ModelService implements com.acheron.service.service.Service<ModelDto,Long> {


    @Override
    public List<ModelDto> findAll() {
        return null;
    }

    @Override
    public Optional<ModelDto> findById(Long id) {
        return Optional.empty();
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
