package com.printable.digital.works.controller;

import com.printable.digital.works.model.User;
import com.printable.digital.works.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonalDataPage {
    @Autowired
    User user;
    @Autowired
    UserService userService;

    @GetMapping("/personal-data")
    public String personalDataPage(Model model) {
        model.addAttribute("user", user);
        return "personal-data-page";
    }

    @PostMapping("/update-personal-data")
    public String updatePersonalData(@ModelAttribute User inputedUserData) {
        userService.updateUser(inputedUserData);
        return "personal-data-page";
    }

}
