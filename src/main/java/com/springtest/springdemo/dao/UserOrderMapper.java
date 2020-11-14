package com.springtest.springdemo.dao;

import com.springtest.springdemo.pojo.entity.UserOrder;

/**
 * @author lingnill
 * @param
 * @return
 */
public interface UserOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(UserOrder record);

    int insertSelective(UserOrder record);

    UserOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(UserOrder record);

    int updateByPrimaryKey(UserOrder record);
}