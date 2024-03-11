package com.example.demo.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class WebController {

    @GetMapping("/")
    public String getHomePage() {
        return "Home Page";
    }
    
    @GetMapping("/about")
    public static String getAboutPage(){
        return "About Page";
    }
}
