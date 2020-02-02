package com.example.car_rental.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FronetendController {



    @GetMapping("/")
    public String stronaGlowna(Model model) {
        model.addAttribute("imie", "Grzegorz");
        return "index";
    }
}
