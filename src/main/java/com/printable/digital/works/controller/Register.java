package com.printable.digital.works.controller;

import com.printable.digital.works.model.RegistrationDTO;
import com.printable.digital.works.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Register {
    @Autowired
    RegistrationService registrationService;

    @PostMapping("/register-account")
    public String registerAccount(@ModelAttribute RegistrationDTO registrationDTO) {
        if (registrationService.registerAccount(registrationDTO)) {
            return "main-landing-page";
        }
        return "redirect:login-page";
    }

}
