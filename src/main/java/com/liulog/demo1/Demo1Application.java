package com.liulog.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        System.out.println("helloworld1");
        SpringApplication.run(Demo1Application.class, args);
        System.out.println("helloworld2");
    }

}
