package com.acheron.service.service;

import com.acheron.db.model.Car;
import com.acheron.db.repository.CarRepository;
import com.acheron.service.dto.CarDto;
import com.acheron.service.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CarService implements com.acheron.service.service.Service<CarDto,Long> {

    @Autowired
    CarRepository carRepository;
    @Autowired
    CarMapper carMapper;
    @Override
    public List<CarDto> findAll() {
        var all = carRepository.findAll();
        System.out.println("sd");
        return carRepository.findAll().stream().map(carMapper::mapTo).toList();
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
