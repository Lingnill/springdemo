package com.springtest.springdemo.dao;

import com.springtest.springdemo.pojo.entity.shopCar;

public interface shopCarMapper {
    int deleteByPrimaryKey(Integer shopCarId);

    int insert(shopCar record);

    int insertSelective(shopCar record);

    shopCar selectByPrimaryKey(Integer shopCarId);

    int updateByPrimaryKeySelective(shopCar record);

    int updateByPrimaryKey(shopCar record);
}