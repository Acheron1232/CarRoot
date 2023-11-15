package com.acheron.web.rest;

import com.acheron.service.dto.BrandDto;
import com.acheron.service.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/")
public class BrandRestController {
    @Autowired
    BrandService brandService;
    @GetMapping("/")
    public List<BrandDto> restPage(){
        return brandService.findAll();
    }
}
