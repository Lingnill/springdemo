package com.springtest.springdemo.dao;

import com.springtest.springdemo.pojo.entity.User;

/**
 * @author lingnill
 * @param
 * @return
 */
public interface UserMapper {

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByPhone(String phone);
}