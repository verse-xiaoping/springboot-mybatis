package com.github.springboot.mybatis.service;

import com.github.springboot.mybatis.entity.User;
import com.github.springboot.mybatis.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by verse on 2018/4/9.
 */
@Service
public class UserService {
    @Resource
    UserMapper userMapper;
    public User findByName(String name){
        return userMapper.findByName(name);
    }
}
