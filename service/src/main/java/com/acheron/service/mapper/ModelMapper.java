package com.acheron.service.mapper;

import com.acheron.db.model.Brand;
import com.acheron.db.model.Car;
import com.acheron.db.model.Model;
import com.acheron.service.dto.BrandDto;
import com.acheron.service.dto.CarDto;
import com.acheron.service.dto.ModelDto;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;


@org.mapstruct.Mapper(componentModel = "spring")
@Component
public interface ModelMapper extends Mapper<Brand, BrandDto>{

    @Mapping(source = "brand", target = "brandDto")
    public ModelDto mapTo(Model model);

}
