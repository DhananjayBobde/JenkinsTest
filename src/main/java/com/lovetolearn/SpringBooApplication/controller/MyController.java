package com.lovetolearn.SpringBooApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}
