package com.example.edu.microsvc.question.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
    @RequestMapping(value = "/hello")
    public  String hello(){
        return  "hello from QuestionController";
    }
}
