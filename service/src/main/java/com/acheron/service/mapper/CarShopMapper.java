package com.acheron.service.mapper;

import com.acheron.db.model.CarShop;
import com.acheron.service.dto.CarShopDto;
import org.springframework.stereotype.Component;

@Component
@org.mapstruct.Mapper(componentModel = "spring")
public interface CarShopMapper extends Mapper<CarShop, CarShopDto> {
}
