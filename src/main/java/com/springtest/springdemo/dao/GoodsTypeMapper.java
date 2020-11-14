package com.springtest.springdemo.dao;

import com.springtest.springdemo.pojo.entity.GoodsType;

/**
 * @author lingnill
 * @param
 * @return
 */
public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer goodsTypeId);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer goodsTypeId);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}