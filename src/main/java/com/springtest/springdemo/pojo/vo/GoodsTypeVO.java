package com.springtest.springdemo.pojo.vo;

import com.springtest.springdemo.pojo.entity.GoodsType;
import lombok.Data;

import java.util.List;

/**
 * @author lingnill
 */
@Data
public class GoodsTypeVO extends GoodsType {
    private List<GoodsTypeVO> childrenTypes;
}
