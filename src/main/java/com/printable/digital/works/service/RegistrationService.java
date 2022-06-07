package com.printable.digital.works.service;

import com.printable.digital.works.model.RegistrationDTO;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public boolean registerAccount(RegistrationDTO registrationDTO) {
        //TODO: insert logic for adding a new user
        return (registrationDTO.getPassword().equals(registrationDTO.getConfirmationPassword()));
        //return true;
    }

}
