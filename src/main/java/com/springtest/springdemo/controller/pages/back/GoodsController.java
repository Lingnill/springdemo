package com.springtest.springdemo.controller.pages.back;

import com.springtest.springdemo.pojo.entity.Goods;
import com.springtest.springdemo.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author lingnill
 */
@Controller
@RequestMapping("/pages/back/goods")
public class GoodsController {
    @Resource
    GoodsService goodsService;
    @RequestMapping("addPre")
    String addPre(){
        return "pages/back/goods/goods-addPre";
    }

    @PostMapping("add")
    @ResponseBody
    Map<String,Object> add(Goods goods){
        return goodsService.add(goods);
    }
}