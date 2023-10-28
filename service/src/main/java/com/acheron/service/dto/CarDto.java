package com.acheron.service.dto;

import lombok.Builder;
import lombok.Value;


@Value
@Builder
public class CarDto implements Dto{

    Long id;
    ModelDto modelDto;
    UsersDto usersDto;
}
