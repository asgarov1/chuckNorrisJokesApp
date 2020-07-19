package com.asgarov.app.controller;

import com.asgarov.app.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {

    private JokeService jokeService;

    public HomeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/", "index"})
    public String index(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }

}
