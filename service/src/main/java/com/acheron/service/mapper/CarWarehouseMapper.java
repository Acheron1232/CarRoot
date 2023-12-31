package com.acheron.service.mapper;

import com.acheron.db.model.Brand;
import com.acheron.db.model.CarDescription;
import com.acheron.db.model.CarWarehouse;
import com.acheron.service.dto.BrandDto;
import com.acheron.service.dto.CarDescriptionDto;
import com.acheron.service.dto.CarWarehouseDto;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;


@org.mapstruct.Mapper(componentModel = "spring")
@Component
public interface CarWareHouseMapper extends Mapper<CarWarehouse, CarWarehouseDto>{
    @Mapping(source = "car",target = "carDto")
    @Mapping(source = "carShop",target = "carShopDto")
    public CarWarehouseDto mapTo(CarWarehouse carWarehouse);
}
