package com.example.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(HttpSession session) {
        if(session.getAttribute("counter") == null) {
            session.setAttribute("counter", 0);
        }
        else {
            Integer currentCount = (Integer) session.getAttribute("counter");
            currentCount++;
            session.setAttribute("counter", currentCount);
        }

        return "/WEB-INF/index.jsp";
    }

    @RequestMapping("/counter")
    public String counter(HttpSession session, Model model) {
        Integer currentCount = (Integer) session.getAttribute("counter");

        model.addAttribute("currentCount", currentCount);

        return "/WEB-INF/counter.jsp";
    }

    @RequestMapping("/countby2")
    public String countByTwo(HttpSession session, Model model) {

        Integer currentCount = (Integer) session.getAttribute("counter");

        if(session.getAttribute("counter") == null) {
            session.setAttribute("counter", 0);
        }
        else {
            currentCount+=2;
            session.setAttribute("counter", currentCount);
        }

        model.addAttribute("currentCount", currentCount);

        return "/WEB-INF/countByTwo.jsp";
    }
}
