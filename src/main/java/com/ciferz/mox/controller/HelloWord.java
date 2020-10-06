package com.ciferz.mox.controller;

import com.ciferz.mox.model.UserData;
import com.ciferz.mox.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @Autowired
    UserService userService;

    @GetMapping("/Hello")
    public String helloWord(){
        return "Hello";
    }

    @PostMapping("/saveUser")
    public String newEmployee(@RequestBody UserData newUser) {
        return userService.saveUserData(newUser);
    }
}
