package com.acheron.service.service;

import com.acheron.service.dto.CarDto;
import com.acheron.service.dto.CarImageDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CarImageService implements com.acheron.service.service.Service<CarImageDto,Long> {


    @Override
    public List<CarImageDto> findAll() {
        return null;
    }

    @Override
    public Optional<CarImageDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public CarImageDto save(CarImageDto object) {
        return null;
    }

    @Override
    public CarImageDto update(Long id, CarImageDto object) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
