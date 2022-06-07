package com.printable.digital.works.service;

import com.printable.digital.works.model.UserCredentials;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean credentialsCheck(UserCredentials userCredentials){
        return userCredentials.getUserName().equals("admin") && userCredentials.getPassword().equals("admin");
    }

}
