package com.printable.digital.works.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainLandingPage {

    @GetMapping("/main-landing-page")
    public String mainLandingPage() {
        return "mainLandingPage";
    }

}
