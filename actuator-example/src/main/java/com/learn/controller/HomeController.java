package com.learn.controller;

import com.learn.helpler.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private Student student;
    @GetMapping("/getdata")
    public Map<String,String>getdata(){
        return Map.of("name","Vikash Soni");
    }
}
