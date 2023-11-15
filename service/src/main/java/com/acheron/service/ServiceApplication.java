package com.acheron.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.acheron.db", "com.acheron.service","com.acheron.service.mapper"})
public class ServiceApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(ServiceApplication.class, args);


    }

}
