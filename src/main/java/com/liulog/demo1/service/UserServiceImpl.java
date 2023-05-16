package com.liulog.demo1.service;

import com.liulog.demo1.dao.UserDao;
import com.liulog.demo1.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    UserDao userDao;

    public void addUser(String username,String password){
        userDao.insert(new UserPojo(username,password));
    }

}
