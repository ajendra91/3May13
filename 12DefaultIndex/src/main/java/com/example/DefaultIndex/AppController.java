package com.example.DefaultIndex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/login")
    public String hello(){
        return "login.html";
    }

}
