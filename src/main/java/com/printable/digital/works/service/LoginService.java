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
        loginRepository.findBy()
        return userCredentials.getUserName().equals("admin") && userCredentials.getPassword().equals("admin");
    }

}
