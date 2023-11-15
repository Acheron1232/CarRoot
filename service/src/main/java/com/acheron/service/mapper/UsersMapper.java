package com.acheron.service.mapper;

import com.acheron.db.model.CarDescription;
import com.acheron.db.model.CarWarehouse;
import com.acheron.db.model.Users;
import com.acheron.service.dto.CarDescriptionDto;
import com.acheron.service.dto.CarWarehouseDto;
import com.acheron.service.dto.UsersDto;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;


@org.mapstruct.Mapper(componentModel = "spring")
@Component
public interface UsersMapper extends Mapper<Users, UsersDto>{
//    @Mapping(source = "users",target = "usersDto")
    public UsersDto mapTo(Users users);
}
