package com.springtest.springdemo.dao;

import com.springtest.springdemo.pojo.entity.OrderInfo;

/**
 * @author lingnill
 * @param
 * @return
 */
public interface OrderInfoMapper {

    int deleteByPrimaryKey(Integer orderInfoId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer orderInfoId);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}