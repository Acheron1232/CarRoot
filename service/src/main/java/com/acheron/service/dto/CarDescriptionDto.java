package com.acheron.service.dto;

import lombok.Builder;
import lombok.Value;


@Value
@Builder
public class CarDescriptionDto implements Dto{

    Long id;
    CarDto carDto;
    String description;
}
