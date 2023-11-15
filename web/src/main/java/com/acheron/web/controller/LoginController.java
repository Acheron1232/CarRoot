package com.acheron.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class LoginController {

    @GetMapping("/login")
//    @CrossOrigin("http://localhost:63342/")
    public String loginPage(){
        return "login";
    }
}
