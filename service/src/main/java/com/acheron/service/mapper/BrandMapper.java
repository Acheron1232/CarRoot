package com.acheron.service.mapper;

import com.acheron.db.model.Brand;
import com.acheron.service.dto.BrandDto;
import org.springframework.stereotype.Component;

@Component
public class BrandMapper implements Mapper<Brand,BrandDto>{

    @Override
    public BrandDto map(Brand object) {
        return new BrandDto(object.getId(), object.getName());
    }

    public Brand map(BrandDto object) {
        return new Brand(object.getId(), object.getName());
    }

    public Brand map(BrandDto from,Brand to){
        to.setId(from.getId());
        to.setName(from.getName());
        return to;
    }
}
