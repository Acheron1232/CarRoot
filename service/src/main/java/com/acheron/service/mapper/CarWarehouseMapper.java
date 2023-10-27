package com.acheron.service.mapper;

import com.acheron.db.model.CarWarehouse;
import com.acheron.service.dto.CarDto;
import com.acheron.service.dto.CarShopDto;
import com.acheron.service.dto.CarWarehouseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CarWarehouseMapper implements Mapper<CarWarehouse, CarWarehouseDto>{
    @Autowired
    CarMapper carMapper;

    @Autowired
    CarShopMapper carShopMapper;

    @Override
    public CarWarehouseDto map(CarWarehouse object) {
        CarDto carDto = Optional.ofNullable(object.getCar()).map(carMapper::map).orElse(null);
        CarShopDto carShopDto = Optional.ofNullable(object.getCarShop()).map(carShopMapper::map).orElse(null);
        return new CarWarehouseDto(object.getId(), carShopDto,carDto, object.getCount());
    }
}
