package com.acheron.service.mapper;

import com.acheron.db.model.Brand;
import com.acheron.db.model.Car;
import com.acheron.service.dto.BrandDto;
import com.acheron.service.dto.CarDto;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;


@org.mapstruct.Mapper(componentModel = "spring")
@Component
public interface CarMapper extends Mapper<Car, CarDto>{
    @Mapping(source = "users",target = "usersDto")
    @Mapping(source = "model",target = "modelDto")
    public CarDto mapTo(Car car);
}
