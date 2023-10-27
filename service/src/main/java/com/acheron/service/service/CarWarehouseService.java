package com.acheron.service.service;

import com.acheron.service.dto.BrandDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarWarehouseService implements com.acheron.service.service.Service<BrandDto,Long> {


    @Override
    public List<BrandDto> findAll() {
        return null;
    }

    @Override
    public Optional<BrandDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public BrandDto save(BrandDto object) {
        return null;
    }

    @Override
    public BrandDto update(Long id, BrandDto object) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return true;
    }
}
