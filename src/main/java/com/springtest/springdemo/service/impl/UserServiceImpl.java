package com.springtest.springdemo.service.impl;

import com.springtest.springdemo.dao.UserMapper;
import com.springtest.springdemo.pojo.entity.User;
import com.springtest.springdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lingnill
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public boolean login(User user) {
        User dbuser = userMapper.selectByPhone(user.getPhone());
        if (dbuser==null){
            return false;
        }else {
            if (user.getPassword()==null){
                return false;
            }
            if (user.getPassword().equals(dbuser.getPassword())){
                return true;
            }
        }
        return false;
    }
}
