package com.alpha.springmybatis.service;

import com.alpha.springmybatis.mapper.UserMapper;
import com.alpha.springmybatis.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public Person Sel(int id){
        return userMapper.Sel(id);
    }
}