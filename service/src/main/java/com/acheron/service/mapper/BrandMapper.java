package com.acheron.service.mapper;

import com.acheron.db.model.Brand;
import com.acheron.service.dto.BrandDto;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;


@org.mapstruct.Mapper(componentModel = "spring")
@Component
public interface BrandMapper extends Mapper<Brand,BrandDto>{
}
