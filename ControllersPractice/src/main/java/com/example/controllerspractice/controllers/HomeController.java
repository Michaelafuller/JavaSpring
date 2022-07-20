package com.example.controllerspractice.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
// New import needed!
import org.springframework.ui.Model;
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {

        String firstName = "Ada";
        String lastName = "Lovelace";
        String email = "ones@zeroes.com";
        Integer age = 160;

        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        model.addAttribute("age", age);
        return "/WEB-INF/index.jsp";
    }
}

