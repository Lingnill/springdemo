package com.springtest.springdemo.dao;

import com.springtest.springdemo.pojo.entity.userOrder;

public interface userOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(userOrder record);

    int insertSelective(userOrder record);

    userOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(userOrder record);

    int updateByPrimaryKey(userOrder record);
}