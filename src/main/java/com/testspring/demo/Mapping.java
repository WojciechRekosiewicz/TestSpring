package com.testspring.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mapping {

    @GetMapping(value = "/")
    public String tester(){
        return "Hi Ass.. I mean my friend ";
    }
}
