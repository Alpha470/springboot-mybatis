package com.alpha.springmybatis.controller;

import com.alpha.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;
    public UserController() {
    }

    @RequestMapping ("getPerson/{id}")
    public String getPerson(@PathVariable int id){

        return userService.Sel(id).toString();
    }
}
