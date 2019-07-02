package com.security.example.controller;


import com.security.example.entity.User;
import com.security.example.servcice.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



//http 头认证 在此处login里可以返回给前端jwt  进入login方法之前 security会认证是否成功
@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public Object login(@AuthenticationPrincipal User loginedUser,
                        @RequestParam(name = "logout", required = false) String logout) {

        System.out.println("执行了呀");
        System.out.println("context信息为："+SecurityContextHolder.getContext().toString());//等价于   System.out.println(loginedUser);

        if (logout != null) {
            return null;
        }
        if (loginedUser != null) {
            System.out.println("用户" + loginedUser);
            System.out.println(userService.getById(loginedUser.getId()));
            //TODO  返回给前端JWT
            return userService.getById(loginedUser.getId());

        }
        return null;
    }

    @RequestMapping(value = "/user/test")
    @ResponseBody
    public String test() {
        return "你好有权限的人";
    }

    @RequestMapping(value = "/user/list")
    @ResponseBody
    @Secured("ROLE_ADMIN")
    public String list() {
        return "你好有权限的人";
    }

    @RequestMapping(value = "/home")
    public String home() {
        return "Home";
    }


}
