package com.acheron.service.service;

import com.acheron.service.dto.BrandDto;
import com.acheron.service.dto.CarShopDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarShopService implements com.acheron.service.service.Service<CarShopDto,Long> {


    @Override
    public List<CarShopDto> findAll() {
        return null;
    }

    @Override
    public Optional<CarShopDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public CarShopDto save(CarShopDto object) {
        return null;
    }

    @Override
    public CarShopDto update(Long id, CarShopDto object) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
