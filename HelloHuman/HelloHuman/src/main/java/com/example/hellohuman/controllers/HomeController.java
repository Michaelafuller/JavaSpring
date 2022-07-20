package com.example.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index(@RequestParam(value="first", required = false) String firstName,
                        @RequestParam(value="last", required = false) String lastName,
                        @RequestParam(value="times", required = false) Integer times) {

            String stringOutput = "";
        if(times != null) {
            for(int i = times; i > 0; i--) {
                stringOutput += "Hello " + firstName + " " + lastName + " ";
            }
        }
        else {
            return lastName != null ? "Hello " + firstName + " " + lastName
                : "Hello " + firstName;
        }

        return firstName != null ? stringOutput : "Hello human!";
    }
}
