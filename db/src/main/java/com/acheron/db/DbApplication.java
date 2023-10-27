package com.acheron.db;

import com.acheron.db.parser.CarParser;
import com.acheron.db.repository.BrandRepository;
import com.acheron.db.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.acheron.db")
public class DbApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(DbApplication.class, args);
        var parser = context.getBean(CarParser.class);
        parser.parse();
    }
}
