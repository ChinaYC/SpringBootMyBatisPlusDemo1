package com.liulog.demo1.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liulog.demo1.dao.UserDao;
import com.liulog.demo1.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    UserDao userDao;

    public void addUser(String username,String password){

        userDao.insert(new UserPojo(username,password));
    }

    public void delUserById(String username){
        userDao.deleteById(username);
//        userDao.delete();
    }

    public void delUserByName(String username){
        userDao.delete(new QueryWrapper<UserPojo>().like("username",username));
    }

    public String findUserByName(String username){
//        userDao.selectOne(new QueryWrapper<UserPojo>().eq("username",username));
        UserPojo pojo = userDao.selectOne(new QueryWrapper<UserPojo>().like("username",username));
        System.out.println(pojo);
        return pojo.getUsername();
    }
    public String findlist(String username){
//        userDao.selectOne(new QueryWrapper<UserPojo>().eq("username",username));
        List<UserPojo> pojo = userDao.selectList(new QueryWrapper<UserPojo>().like("username",username));
        System.out.println(pojo);
        pojo.forEach(item ->{
            System.out.println(item);
        });
        return username;
    }

    public void updateUserByName(String username,String pw){
        UserPojo pojo = userDao.selectById(username);
        pojo.setPassword(pw);
        userDao.update(pojo,new QueryWrapper<UserPojo>().eq("username",username));
    }


}
