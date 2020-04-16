package com.ae.exercise501;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String about(){
        return "about";
    }
    @RequestMapping("/about")
    public String homeDefault(){
        return "about";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
}
