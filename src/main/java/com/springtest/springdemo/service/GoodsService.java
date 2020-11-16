package com.springtest.springdemo.service;

import com.springtest.springdemo.pojo.entity.Goods;

import java.util.Map;

/**
 * @author lingnill
 */
public interface GoodsService {

    Map<String,Object> add(Goods goods);
}
