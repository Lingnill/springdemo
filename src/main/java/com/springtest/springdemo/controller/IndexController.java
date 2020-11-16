package com.springtest.springdemo.controller;
import com.springtest.springdemo.dao.UserMapper;
import com.springtest.springdemo.pojo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lingnill
 */
@RestController
@RequestMapping("/")
public class IndexController {
    @Resource
    UserMapper userMapper;
    String index() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
        return "index";
    }

    @GetMapping(name = "", value = "/user")
    public User getUser() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
        return user;
    }


}
