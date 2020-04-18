package com.example.edu.microsvc.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/hello")
    public String Hello(){
        return  "A";
    }
}
