package com.example.daikichiroutes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class OmikujiController {

    @GetMapping("/")
    public String index() {
        return "/WEB-INF/omikujiForm.jsp";
    }

    @PostMapping("/submit")
    public String submit(HttpSession session,
        @RequestParam(value="yearNumber") Integer yearNumber,
        @RequestParam(value="city") String city,
        @RequestParam(value="roommate") String roommate,
        @RequestParam(value="job") String job,
        @RequestParam(value="livingThing") String livingThing,
        @RequestParam(value="message") String message) {

        session.setAttribute("yearNumber", yearNumber);
        session.setAttribute("city", city);
        session.setAttribute("roommate", roommate);
        session.setAttribute("job", job);
        session.setAttribute("livingThing", livingThing);
        session.setAttribute("message", message);

        return "redirect:/results";
    }

    @GetMapping("/results")
    public String results(HttpSession session, Model model) {

        Integer yearNumber = (Integer) session.getAttribute("yearNumber");
        model.addAttribute("yearNumber", yearNumber);
        String city = (String) session.getAttribute("city");
        model.addAttribute("city", city);
        String roommate = (String) session.getAttribute("roommate");
        model.addAttribute("roommate", roommate);
        String job = (String) session.getAttribute("job");
        model.addAttribute("job", job);
        String livingThing = (String) session.getAttribute("livingThing");
        model.addAttribute("livingThing", livingThing);
        String message = (String) session.getAttribute("message");
        model.addAttribute("message", message);

        return "/WEB-INF/omikujiResults.jsp";
    }
}


