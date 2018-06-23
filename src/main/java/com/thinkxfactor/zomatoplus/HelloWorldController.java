package com.thinkxfactor.zomatoplus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HelloWorldController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}



