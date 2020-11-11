package com.springtest.springdemo.dao;

import com.springtest.springdemo.pojo.entity.goodsType;

public interface goodsTypeMapper {
    int deleteByPrimaryKey(Integer goodsTypeId);

    int insert(goodsType record);

    int insertSelective(goodsType record);

    goodsType selectByPrimaryKey(Integer goodsTypeId);

    int updateByPrimaryKeySelective(goodsType record);

    int updateByPrimaryKey(goodsType record);
}