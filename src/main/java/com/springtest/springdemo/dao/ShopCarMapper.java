package com.springtest.springdemo.dao;

import com.springtest.springdemo.pojo.entity.ShopCar;

/**
 * @author lingnill
 * @param
 * @return
 */
public interface ShopCarMapper {
    int deleteByPrimaryKey(Integer shopCarId);

    int insert(ShopCar record);

    int insertSelective(ShopCar record);

    ShopCar selectByPrimaryKey(Integer shopCarId);

    int updateByPrimaryKeySelective(ShopCar record);

    int updateByPrimaryKey(ShopCar record);
}