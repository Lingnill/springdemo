package com.springtest.springdemo.service;

import com.springtest.springdemo.pojo.dto.ResponseDTO;
import com.springtest.springdemo.pojo.entity.GoodsType;
import com.springtest.springdemo.pojo.vo.GoodsTypeVO;

import java.util.List;
import java.util.Map;

/**
 * @author lingnill
 */
public interface TypeService {
    ResponseDTO add(GoodsType goodsType);

    List<GoodsTypeVO> selectTypesByParentId(int i);
}
