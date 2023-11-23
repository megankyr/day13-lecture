package com.ssf.day13lecture.controller;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/user")
    public String createUser(@RequestBody MultiValueMap<String, String>
    form, Model model) { 
        String name = form.getFirst("name");
        String email = form.getFirst("email");
        String phone = form.getFirst("phone");

        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println("phone: " + phone);
    

        return "";

    }
    
}
