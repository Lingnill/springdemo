package com.springtest.springdemo.dao;

import com.springtest.springdemo.pojo.entity.orderInfo;

public interface orderInfoMapper {
    int deleteByPrimaryKey(Integer orderInfoId);

    int insert(orderInfo record);

    int insertSelective(orderInfo record);

    orderInfo selectByPrimaryKey(Integer orderInfoId);

    int updateByPrimaryKeySelective(orderInfo record);

    int updateByPrimaryKey(orderInfo record);
}