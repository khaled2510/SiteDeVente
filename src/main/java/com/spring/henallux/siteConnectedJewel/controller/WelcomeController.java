package com.spring.henallux.siteConnectedJewel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value="/accueil")
public class WelcomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home (Model model) {
        //String title = "Accueil";
        //model.addAttribute("title", title);
        return "integrated:welcome";
    }
}
