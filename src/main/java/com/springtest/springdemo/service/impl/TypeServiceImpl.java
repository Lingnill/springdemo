package com.springtest.springdemo.service.impl;

import com.springtest.springdemo.pojo.vo.GoodsTypeVO;
import com.springtest.springdemo.service.TypeService;
import com.springtest.springdemo.dao.GoodsTypeMapper;
import com.springtest.springdemo.pojo.dto.ResponseDTO;
import com.springtest.springdemo.pojo.entity.GoodsType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author lingnill
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    GoodsTypeMapper goodsTypeMapper;
    @Override
    public ResponseDTO add(GoodsType goodsType) {
        if (goodsTypeMapper.insert(goodsType)==1){
            return ResponseDTO.ok("添加商品类型成功！");
        }else{
            return ResponseDTO.fail("添加商品类型失败！");
        }
    }

    @Override
    public List<GoodsTypeVO> selectTypesByParentId(int i){
        List<GoodsTypeVO> parentTypes =goodsTypeMapper.selectTypesByParentId(i);
        List<GoodsTypeVO> childrenTypes = goodsTypeMapper.selectTypesByParentIds(parentTypes);
        Map<Integer,List<GoodsTypeVO>> collect =childrenTypes.stream().collect(Collectors.groupingBy(GoodsTypeVO::getParentTypeId));
        for (GoodsTypeVO g : parentTypes) {
            List<GoodsTypeVO> childrenTypes1 = collect.get(g.getGoodsTypeId());
            g.setChildrenTypes(childrenTypes1);
        }
        return parentTypes;
    }
}
