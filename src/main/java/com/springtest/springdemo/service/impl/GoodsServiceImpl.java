package com.springtest.springdemo.service.impl;

import com.springtest.springdemo.dao.GoodsMapper;
import com.springtest.springdemo.pojo.dto.ResponseDTO;
import com.springtest.springdemo.pojo.entity.Goods;
import com.springtest.springdemo.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lingnill
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsMapper goodsMapper;
    @Override
    public Map<String, Object> add(Goods goods) {
        Map<String,Object> respMap = new HashMap<>();
        int i = goodsMapper.insertSelective(goods);
        if (i==1){
            respMap.put("res",true);
            respMap.put("res","添加商品成功！");
        }else {
            respMap.put("res",false);
            respMap.put("res","添加商品失败！");
        }
        return respMap;
    }

    @Override
    public ResponseDTO getGoodsByTypeId(Integer typeId) {
        List<Goods> goods=null;
        try {
         goods = goodsMapper.getGoodsByTypeId(typeId);
     }catch (Exception e){
         e.printStackTrace();
         return ResponseDTO.fail("查询商品失败！");
     }

        return ResponseDTO.ok("查询商品成功！",goods);
    }

    @Override
    public Goods getGoodsDetail(Integer goodsId) {
        return goodsMapper.selectByPrimaryKey(goodsId);
    }
}
