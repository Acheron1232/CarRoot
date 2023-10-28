package com.acheron.service.dto;

import lombok.Builder;
import lombok.Value;


@Value
@Builder
public class CarImageDto implements Dto{

    Long id;
    CarDto carDto;
    String ref;
}
