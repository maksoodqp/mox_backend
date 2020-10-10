package com.ciferz.mox.services;

import com.ciferz.mox.model.UserData;
import com.ciferz.mox.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class UserService {

    @Autowired
    private UserDataRepository userDataRepository;

    public String saveUserData(UserData userData){
        UserData data = userDataRepository.save(userData);
        if(data != null){
            return "Success";
        }else{
            return "Failed";
        }
    }
}
