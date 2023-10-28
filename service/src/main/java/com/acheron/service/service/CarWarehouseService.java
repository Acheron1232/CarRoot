package com.acheron.service.service;

import com.acheron.service.dto.BrandDto;
import com.acheron.service.dto.CarWarehouseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarWarehouseService implements com.acheron.service.service.Service<CarWarehouseDto,Long> {


    @Override
    public List<CarWarehouseDto> findAll() {
        return null;
    }

    @Override
    public Optional<CarWarehouseDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public CarWarehouseDto save(CarWarehouseDto object) {
        return null;
    }

    @Override
    public CarWarehouseDto update(Long id, CarWarehouseDto object) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
