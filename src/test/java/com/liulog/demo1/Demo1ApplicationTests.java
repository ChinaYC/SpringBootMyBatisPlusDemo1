package com.liulog.demo1;

import com.liulog.demo1.dao.UserDao;
import com.liulog.demo1.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    hello hello;

    @Autowired
    UserServiceImpl userService;

    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
        hello.say();
//        userService.delUserByName("lia");
//        userService.addUser("liam6","L123456");
        userService.updateUserByName("liam1","L212");
//        userService.findUserByName("liam");
        userService.findlist("liam");
    }
//
//    @Test
//   void test(){
//        hello.say();
//
//    }
}
