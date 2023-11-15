package com.acheron.web.rest;

import com.acheron.service.dto.UsersDto;
import com.acheron.service.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class TestRestController {
    @Autowired
    UsersService usersService;
    @GetMapping("/js")
    @CrossOrigin("http://localhost:63342/")
    public List<UsersDto> restServlet(){
        return usersService.findAll();
    }
}
