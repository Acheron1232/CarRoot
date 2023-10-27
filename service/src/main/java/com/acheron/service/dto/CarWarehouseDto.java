package com.acheron.service.dto;

import lombok.Value;

@Value
public class CarWarehouseDto {
    Long id;
    CarShopDto carShopDto;
    CarDto carDto;
    Long count;
}
