package com.hcoe.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
    @RequestMapping(value="/home")
    public String home(){
    return "/index";
    }
    
}
