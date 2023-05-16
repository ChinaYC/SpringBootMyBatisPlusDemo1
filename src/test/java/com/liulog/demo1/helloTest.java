package com.liulog.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class helloTest {

    @Autowired
    hello say;
    void contextLoads() {
        hello.say();
    }

}