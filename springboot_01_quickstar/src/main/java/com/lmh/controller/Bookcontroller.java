package com.lmh.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class Bookcontroller {

    @GetMapping
    public String getById(){
        System.out.println("spring boot is running...2");
        return "spring boot is running 2";
    }
}
