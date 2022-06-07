package com.printable.digital.works.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalDataPage {
    @GetMapping("/personal-data")
    public String personalDataPage() {
        return "personal-data-page";
    }

}
