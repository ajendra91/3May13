package com.example.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    public String fun(){
        return "redirect:/homePage";
    }

    @RequestMapping("/homePage")
    public String demo(){
        return "page/index";
    }
}
