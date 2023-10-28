package com.acheron.service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.Value;

@Value
@Builder
public class CarShopDto implements Dto{
    Long id;
    String name;
    String address;
}
