package com.ciferz.mox.controller;

import com.ciferz.mox.services.UserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public HttpResponse login(){
        

        return null;
    }
}
