package com.springtest.springdemo.service;

import com.springtest.springdemo.pojo.dto.ResponseDTO;
import com.springtest.springdemo.pojo.entity.Goods;

import java.util.Map;

/**
 * @author lingnill
 */
public interface GoodsService {

    Map<String,Object> add(Goods goods);

    ResponseDTO getGoodsByTypeId(Integer typeId);

    Goods getGoodsDetail(Integer goodsId);
}
