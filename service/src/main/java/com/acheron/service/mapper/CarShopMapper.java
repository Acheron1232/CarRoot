package com.acheron.service.mapper;

import com.acheron.db.model.CarShop;
import com.acheron.service.dto.CarShopDto;
import org.springframework.stereotype.Component;

@Component
public class CarShopMapper implements Mapper<CarShop, CarShopDto>{


    @Override
    public CarShopDto map(CarShop object) {
        return new CarShopDto(object.getId(), object.getName(), object.getAddress());
    }
}
