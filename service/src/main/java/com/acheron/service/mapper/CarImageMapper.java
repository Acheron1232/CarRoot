package com.acheron.service.mapper;

import com.acheron.db.model.CarDescription;
import com.acheron.db.model.CarImage;
import com.acheron.service.dto.CarDescriptionDto;
import com.acheron.service.dto.CarImageDto;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@org.mapstruct.Mapper(componentModel = "spring")
@Component
public interface CarImageMapper extends Mapper<CarImage, CarImageDto>{
    @Mapping(source = "car",target = "carDto")
    public CarImageDto mapTo(CarImage carImage);
}