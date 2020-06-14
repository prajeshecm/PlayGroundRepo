package com.playground.gkubernetes.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {


    @GetMapping("/getK/{str}")
    public String getKubernetes(@PathVariable String str){
        System.out.println("getKubernetes is invoked Successfully ..");
         return str+ " kubernetes";
    }
}
