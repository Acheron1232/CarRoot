package com.acheron.web.controller;

import com.acheron.service.dto.CarDescriptionDto;
import com.acheron.service.dto.CarDto;
import com.acheron.service.service.CarDescriptionService;
import com.acheron.service.service.CarImageService;
import com.acheron.service.service.CarService;
import com.acheron.service.service.UsersService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    CarService carService;
    @Autowired
    CarDescriptionService carDescriptionService;
    @Autowired
    CarImageService carImageService;

    @GetMapping("/")
    public String findAllOrders(Model model){
        model.addAttribute("cars",carService.findAll());
        return "shop";
    }
    @GetMapping("/order/{id}/create")
    public String createOrder(Model model, @PathVariable String id, HttpServletRequest request){
//        carService.save())
        return "shop";
    }
}
