package com.acheron.service.mapper;

import com.acheron.db.model.Car;
import com.acheron.service.dto.BrandDto;
import com.acheron.service.dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CarMapper implements Mapper<Car, CarDto>{
    @Autowired
    BrandMapper brandMapper;
    @Override
    public CarDto map(Car object) {
        BrandDto brandDto = Optional.ofNullable(object.getBrand()).map(brandMapper::map).orElse(null);
        return new CarDto(object.getId(),brandDto,object.getColor(),object.getEngine(),object.getModel());
    }
}
