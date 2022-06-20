package com.printable.digital.works.controller;


import com.printable.digital.works.model.RegistrationDTO;
import com.printable.digital.works.model.UserCredentials;
import com.printable.digital.works.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginPage {
    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("userCredentials", new UserCredentials());
        model.addAttribute("registrationDTO", new RegistrationDTO());

        return "login-page";
    }

    @PostMapping("/submit-login")
    public String submitLogin(@ModelAttribute UserCredentials userCredentials, Model model) {

        if (loginService.credentialsCheck(userCredentials)) {
            return "main-landing-page";
        }

        return "redirect:/login";
    }

}
