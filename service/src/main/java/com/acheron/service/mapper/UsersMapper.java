package com.acheron.service.mapper;

import com.acheron.db.model.CarDescription;
import com.acheron.db.model.Users;
import com.acheron.service.dto.CarDescriptionDto;
import com.acheron.service.dto.UsersDto;
import org.springframework.stereotype.Component;


@org.mapstruct.Mapper(componentModel = "spring")
@Component
public interface UsersMapper extends Mapper<Users, UsersDto>{
}
