package com.security.example.dao;

import com.security.example.ExampleApplicationTests;
import com.security.example.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class UserDaoTest extends ExampleApplicationTests {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserDao userDao;

    @Test
    public void Passencode(){
       /* User user= new User();
        user.setUsername("admin");
        userDao.create(user);*/
        System.out.println("密码是"+bCryptPasswordEncoder.encode("admin"));
    }



}