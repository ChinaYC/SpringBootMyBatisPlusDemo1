package com.liulog.demo1.controller;

import com.liulog.demo1.service.UserServiceImpl;
import com.liulog.demo1.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

//    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
//    public String addUser(@RequestParam("username") String username,
//                          @RequestParam("password") String password){
//            userService.addUser(username, password);
//            return Result.okGetStiring();
//    }
    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    public String addUser(){

            return "12321";
    }

}
