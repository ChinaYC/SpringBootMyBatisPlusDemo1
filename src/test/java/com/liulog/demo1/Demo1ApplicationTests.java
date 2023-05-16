package com.liulog.demo1;

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

    @Test
    void contextLoads() {
        hello.say();
        userService.addUser("liam","L123456");

    }
//
//    @Test
//   void test(){
//        hello.say();
//
//    }
}
