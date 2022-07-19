package com.example.controllerspractice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HomeController {

    @RequestMapping("")
    public String hello() {
        return "Hello Steven Segal.";
    }

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String helloWorld() {
        return "Hello world! What route did you use to access me?";
    }

    @RequestMapping("/goodbye")
    public String world() {
        return "Goodbye world!";
    }

}
