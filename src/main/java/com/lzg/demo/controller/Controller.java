package com.lzg.demo.controller;

import com.lzg.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @Autowired
    @Qualifier("user01")
    private User user;

    @GetMapping("/getUser")
    public User getUser(){
        return user;
    }
}
