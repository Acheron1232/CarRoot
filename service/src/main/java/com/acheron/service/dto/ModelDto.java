package com.acheron.service.dto;

import lombok.Builder;
import lombok.Value;


@Value
@Builder
public class ModelDto implements Dto{

    Long id;
    String name;
    String img;
    String bodyType;
    BrandDto brandDto;
}
