package com.acheron.service;

import com.acheron.service.dto.BrandDto;
//import com.acheron.service.service.BrandService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"com.acheron.db", "com.acheron.service","com.acheron.service.mapper"})
public class ServiceApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(ServiceApplication.class, args);
//        var service = context.getBean(BrandService.class);
//        var all = service.findAll();
//        System.out.println(all);

    }

}
