package com.acheron.web.controller;

import com.acheron.service.dto.UsersDto;
import com.acheron.service.service.BrandService;
import com.acheron.service.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    BrandService brandService;
    @Autowired
    ModelService modelService;

    @GetMapping("/")
    public String findAll(Model model, Principal principal){
        System.out.println(principal);
        model.addAttribute("brands",brandService.findAll());
        model.addAttribute("models",modelService.findAll());
        return "brands";
    }
    @GetMapping
    public String findAll1(Model model){
        model.addAttribute("brands",brandService.findAll());
        return "brands";
    }
    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable("id") Long id){
        model.addAttribute("brand",brandService.findById(id));
        model.addAttribute("models",modelService.findByBrandId(id));
        return "brand";
    }
}
