package com.security.example.dao;

import com.security.example.ExampleApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



public class PermissionDaoTest extends ExampleApplicationTests {
    @Autowired
    private PermissionDao permissionDao;

    @Test
    public void getByMap() {
    }

    @Test
    public void getById() {
    }

    @Test
    public void create() {
    }

    @Test
    public void update() {
    }

    @Test
    public void getByUserId() {
        System.out.println(permissionDao.getByUserId(16));
    }
}