package com.printable.digital.works.service;

import com.printable.digital.works.model.UserCredentials;
import com.printable.digital.works.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public boolean credentialsCheck(UserCredentials userCredentials){
        UserCredentials responseUserCredentials;

        try {
            responseUserCredentials = loginRepository.findUserCredentialsByName(userCredentials.getUserName());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (responseUserCredentials == null){
            return false;
        }

        return responseUserCredentials.getPassword().equals(userCredentials.getPassword());
    }

}
