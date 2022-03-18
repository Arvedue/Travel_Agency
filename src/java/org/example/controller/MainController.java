package org.example.controller;

import org.example.services.CountryService;
import org.example.services.HotelNumberCategoryService;
import org.example.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    private PositionService positionService;

    @Autowired
    private HotelNumberCategoryService hotelNumberCategoryService;

    @Autowired
    private CountryService countryService;

    @RequestMapping("/")
    public String mainPage(){
        return "index";
    }

    @RequestMapping("/addAll")
    public String addPositions(){
        addAll();
        return "index";
    }

    private void addAll(){
//        positionService.addAllPositions();
//        hotelNumberCategoryService.addAll();
        countryService.addAll();
    }
}
