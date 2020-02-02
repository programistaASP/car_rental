package com.example.car_rental.controller;

import com.example.car_rental.Dao.SamochodDao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PokazSamochod {

    @RequestMapping("/")
    public String wyświeltSamochody(Model model) {
        SamochodDao dao = new SamochodDao();
        model.addAttribute("samochody", dao.getAll());
        return "index";
    }
}
