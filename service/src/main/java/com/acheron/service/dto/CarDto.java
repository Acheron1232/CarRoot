package com.acheron.service.dto;

import lombok.Value;

@Value
public class CarDto {
    Long id;
    BrandDto brandDto;
    String color;
    String engine;
    String model;
}
