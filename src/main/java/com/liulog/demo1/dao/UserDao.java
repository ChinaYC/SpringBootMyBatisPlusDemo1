package com.liulog.demo1.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liulog.demo1.pojo.UserPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao extends BaseMapper<UserPojo> {

//
//    @Select("SELECT * FROM user")
//    public List<UserPojo> selectUser
    @Select("select * from jojo where username Like 'liam%';")
    UserPojo seles2();


}
