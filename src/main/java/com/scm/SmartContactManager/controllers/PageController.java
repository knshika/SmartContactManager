package com.scm.SmartContactManager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller
public class PageController {
    //html request send through this request
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");
        //sending data to view
        model.addAttribute("name","Knshika");
        model.addAttribute("work", "Samsung Institute Noida");
        model.addAttribute("github", "https://github.com/knshika");
        return "home"; //html dynamic page
    }

    //about route
    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin",false);
        System.out.println("About page loading");
        return "about";
    }

    //service route
    @RequestMapping("/services")
    public String servicePage(){
        System.out.println("Services page loading");
        return "services";
    }
}

//Exception processing template "home": Error resolving template [home], template might not exist or might not be accessible by any of the configured Template Resolvers
