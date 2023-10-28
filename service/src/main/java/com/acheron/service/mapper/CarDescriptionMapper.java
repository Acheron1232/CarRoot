package com.acheron.service.mapper;

import com.acheron.db.model.Brand;
import com.acheron.db.model.CarDescription;
import com.acheron.service.dto.BrandDto;
import com.acheron.service.dto.CarDescriptionDto;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;


@org.mapstruct.Mapper(componentModel = "spring")
@Component
public interface CarDescriptionMapper extends Mapper<CarDescription, CarDescriptionDto>{
    @Mapping(source = "car",target = "carDto")
    public CarDescriptionDto mapTo(CarDescription carDescription);
}
