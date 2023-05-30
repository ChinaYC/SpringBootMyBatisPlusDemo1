package com.liulog.demo1.controller;

import com.liulog.demo1.service.UserServiceImpl;
import com.liulog.demo1.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    final
    UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(@RequestParam("username") String username,
                          @RequestParam("password") String password){
            userService.addUser(username, password);
            return Result.okGetStiring("201","添加成功1");

    }

    @RequestMapping(value = "/addUser",method = RequestMethod.DELETE)
    public String usdelUserById(@RequestParam("username") String username){
        userService.delUserById(username);
        return Result.okGetStiring("200","同一个api删除成功");
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.PUT)
    public String updateUserByName(@RequestParam("username") String username,
                                   @RequestParam("password1") String password){
        userService.updateUserByName(username,password);
        return Result.okGetStiring("200","同一个api更新成功");
    }


    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    public String findUserByName(@RequestParam("username") String username){
            String item = userService.findUserByName(username);
            return Result.okGetStiringByDate("201","body查询成功",item);
//        return item.toString();
    }

    @RequestMapping(value = "/otheraddUser/{username}",method = RequestMethod.GET)
    public String OtherfindUserByName(@PathVariable("username") String username){
        String item = userService.findlist(username);
        return Result.okGetStiringByDate("201","url查询成功",item);
    }

    @RequestMapping(value = "/deletUserById",method = RequestMethod.DELETE)
    public String delUserById(@RequestParam("username") String username){
        userService.delUserById(username);
        return Result.okGetStiring("201","删除成功");
    }

    @RequestMapping(value = "/deletUserByName",method = RequestMethod.DELETE)
    public String delUserByName(@RequestParam("username") String username){
        getUserService().delUserByName(username);
        return Result.okGetStiring("200like","like删除成功");
    }

    private UserServiceImpl getUserService() {
        return userService;
    }

    //不写参数就是全部搜索
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public String search(@RequestParam("username") String username){
        String item = userService.findUserByName(username);
        return Result.okGetStiring(item,"搜索成功");
    }


}
