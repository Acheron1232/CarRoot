package com.acheron.service.service;

import com.acheron.db.model.CarDescription;
import com.acheron.service.dto.CarDescriptionDto;
import com.acheron.service.dto.CarDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CarDescriptionService implements com.acheron.service.service.Service<CarDescriptionDto,Long> {


    @Override
    public List<CarDescriptionDto> findAll() {
        return null;
    }

    @Override
    public Optional<CarDescriptionDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public CarDescriptionDto save(CarDescriptionDto object) {
        return null;
    }

    @Override
    public CarDescriptionDto update(Long id, CarDescriptionDto object) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
