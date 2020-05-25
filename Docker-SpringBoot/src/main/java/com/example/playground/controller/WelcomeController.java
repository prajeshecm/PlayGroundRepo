package com.example.playground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/customer")
public class WelcomeController {

    //public final static Logger LOGGER = Logger.getLogger(WelcomeController.class.getName());
    @GetMapping("/name/{customerName}")
    public String sendWelcome(String customerName){
       // LOGGER.log(Level.debug,"My first Log Message"););
        System.out.println("Welcome =>>"+customerName);
        return "Welcome "+customerName;

    }
}
