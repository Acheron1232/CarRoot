package com.acheron.web.controller;

import com.acheron.db.type.Role;
import com.acheron.service.dto.UsersDto;
import com.acheron.service.service.UsersService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    @Autowired
    UsersService usersService;
    @GetMapping
    public String reg(Model model){
        return "registration";
    }
    @PostMapping
    public String regPost(HttpServletRequest request,Model model){

        usersService.save(UsersDto.builder().
                lastname( request.getParameter("lastname")).
                firstname( request.getParameter("firstname")).
                username(request.getParameter("username")).
                password( request.getParameter("password")).
                role(Role.USER).
                id(1l).
                build());
        return "redirect:/login";
    }
}
