package com.acheron.web.controller;

import com.acheron.service.dto.BrandDto;
import com.acheron.service.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    BrandService brandService;

    @GetMapping("/")
    public String findAll(Model model){
        model.addAttribute("brands",brandService.findAll());
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
        return "brand";
    }
    @PostMapping("/{id}/change")
    public String updateById(@PathVariable("id") Long id, BrandDto newBrand){
        brandService.update(newBrand.getId(), newBrand);
        return "redirect:/brands/{id}";
    }
    @GetMapping("/{id}/change")
    public String updateById(Model model,@PathVariable("id") Long id){
        model.addAttribute("brand",brandService.findById(id));
        return "changeBrand";
    }
}
