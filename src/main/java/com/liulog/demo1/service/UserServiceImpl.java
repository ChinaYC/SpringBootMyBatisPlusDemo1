package com.liulog.demo1.service;

import com.alibaba.fastjson2.JSON;
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
//      return userDao.insert(new UserPojo(username)>0?"susuccess":"fall");
    }

    public void delUserById(String username){
        userDao.deleteById(username);
//        userDao.delete();
    }

    public void delUserByName(String username){
        userDao.delete(new QueryWrapper<UserPojo>().like("username",username));
    }

    public String findUserByName(String username){
        //注意虽然只找一个 但因为用的like 所以会找所有含有的，但只会返回一个数
//        userDao.selectOne(new QueryWrapper<UserPojo>().eq("username",username));
        UserPojo pojo = userDao.selectOne(new QueryWrapper<UserPojo>().like("username",username));
        System.out.println(pojo);
        return pojo.getUsername();
    }
    public String findlist(String username){
//        userDao.selectOne(new QueryWrapper<UserPojo>().eq("username",username));
        List<UserPojo> pojo = userDao.selectList(new QueryWrapper<UserPojo>().like("username",username));

        String result = JSON.toJSONString(pojo);
        System.out.println(result);
        return result;

    }

    public void updateUserByName(String username,String pw){
        UserPojo pojo = userDao.selectById(username);
        pojo.setPassword(pw);
        userDao.update(pojo,new QueryWrapper<UserPojo>().eq("username",username));
    }

    public  UserPojo userSelect(){
        return userDao.seles2();
    }

}
