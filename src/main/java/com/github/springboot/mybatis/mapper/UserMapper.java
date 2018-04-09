package com.github.springboot.mybatis.mapper;

import com.github.springboot.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by verse on 2018/4/9.
 */
public interface UserMapper {
    @Select("Select * from user where name=#{name}")
    User findByName(@Param("name") String name);
}
