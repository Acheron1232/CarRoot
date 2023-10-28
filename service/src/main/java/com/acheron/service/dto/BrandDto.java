package com.acheron.service.dto;

import com.acheron.db.model.Brand;
import jakarta.persistence.Entity;
import lombok.*;
import org.mapstruct.factory.Mappers;


@Value
@Builder
public class BrandDto implements Dto{

    Long id;
    String name;
    String image;
}
