package com.liulog.demo1.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_liam")
public class UserPojo {

    //雪花算法自动生成assign git12
//    @TableId(value = "username",type = IdType.ASSIGN_ID)
    @TableId(value = "username",type = IdType.NONE)
    private String username ;

    @TableField(value = "password")
    private String password ;

//    @TableField(exist = false)
//    private String hello;
}
