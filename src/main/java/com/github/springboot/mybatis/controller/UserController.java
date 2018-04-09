package com.github.springboot.mybatis.controller;

import com.github.springboot.mybatis.entity.User;
import com.github.springboot.mybatis.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by verse on 2018/4/9.
 */
@RestController
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/findByName")
    public User findByName(){
        return userService.findByName("verse");
    }
}
