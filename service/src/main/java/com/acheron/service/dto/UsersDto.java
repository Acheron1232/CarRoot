package com.acheron.service.dto;

import com.acheron.db.type.Role;
import lombok.Builder;
import lombok.Value;


@Value
@Builder
public class UsersDto implements Dto{

    Long id;
    String firstname;
    String lastname;
    Role role;
}
