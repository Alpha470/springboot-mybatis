package com.alpha.springmybatis.mapper;


import com.alpha.springmybatis.model.Person;


import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

        Person Sel(int id);
}