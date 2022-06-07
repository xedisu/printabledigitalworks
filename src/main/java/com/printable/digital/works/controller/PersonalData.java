package com.printable.digital.works.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalData {

    @GetMapping("/personal-data")
    public String personalData(Model model) {

        return "personal-data";
    }
}
