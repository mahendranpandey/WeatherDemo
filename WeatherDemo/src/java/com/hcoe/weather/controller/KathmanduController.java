package com.hcoe.weather.controller;

import com.hcoe.weather.entity.Kathmandu;
import com.hcoe.weather.service.KathmanduService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mkpan
 */
@Controller
@RequestMapping(value="/")
public class KathmanduController {
    
    @Autowired
    private KathmanduService kathmanduService;
        
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mv= new ModelAndView("admin/login");
        return mv;
    }
    @RequestMapping(value="/display", method= RequestMethod.GET)
    public ModelAndView displayKathmandu(){        
        List<Kathmandu> weatherList = kathmanduService.getAll();
        ModelAndView mv = new ModelAndView("display");
        mv.addObject("data", weatherList);
        return mv;       
    }
    
    @RequestMapping(value="/displayWeather", method= RequestMethod.GET)
    public ModelAndView displayWeather(){        
        List<Kathmandu> tenList = kathmanduService.getTen();
        ModelAndView mv = new ModelAndView("displayWeather");
        mv.addObject("data", tenList);
        return mv;       
    }
    
    @RequestMapping(value="/firstpage", method=RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mv= new ModelAndView("firstpage");
        return mv;
    }
    
    @RequestMapping(value="/register", method= RequestMethod.GET)
    public String display(){
        return "register";
    }
    
}
