package com.springtest.springdemo.dao;

import com.springtest.springdemo.pojo.entity.GoodsType;
import com.springtest.springdemo.pojo.vo.GoodsTypeVO;
import lombok.Data;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer goodsTypeId);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer goodsTypeId);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);

    List<GoodsTypeVO> selectTypesByParentId(int i);

    List<GoodsTypeVO> selectTypesByParentIds(@Param("parentTypes") List parentTypes);
}