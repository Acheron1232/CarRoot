package com.acheron.service.service;

import com.acheron.service.dto.CarDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CarService implements com.acheron.service.service.Service<CarDto,Long> {


    @Override
    public List<CarDto> findAll() {
        return null;
    }

    @Override
    public Optional<CarDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public CarDto save(CarDto object) {
        return null;
    }

    @Override
    public CarDto update(Long id, CarDto object) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
