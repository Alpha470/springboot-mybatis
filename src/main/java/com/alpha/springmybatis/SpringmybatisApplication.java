package com.alpha.springmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@MapperScan ("com.alpha.springmybatis.mapper") //扫描的mapper
@SpringBootApplication
public class SpringmybatisApplication {
    SpringmybatisApplication(){}

    public static void main(String[] args) {
        SpringApplication.run(SpringmybatisApplication.class, args);
    }

}
