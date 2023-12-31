package com.acheron.service.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CarWarehouseDto implements Dto{
    Long id;
    CarShopDto carShopDto;
    CarDto carDto;
    Long count;
}
