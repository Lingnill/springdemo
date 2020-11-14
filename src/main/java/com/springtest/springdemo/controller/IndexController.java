package com.springtest.springdemo.controller;
import com.springtest.springdemo.dao.UserMapper;
import com.springtest.springdemo.pojo.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

/**
 * @author lingnill
 */
public class IndexController {
    @Resource
    UserMapper userMapper;
    @RequestMapping("/")
    String index(){
        User user = userMapper.selectByPrimaryKey(1);
        return "index";
    }
}
