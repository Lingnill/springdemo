package com.springtest.springdemo.controller.pages.back;

import com.springtest.springdemo.pojo.dto.ResponseDTO;
import com.springtest.springdemo.pojo.entity.Goods;
import com.springtest.springdemo.service.GoodsService;
import com.springtest.springdemo.service.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    @Resource
    TypeService typeService;

    @RequestMapping("addPre")
    String addPre(Model model){
        model.addAttribute("types",typeService.selectTypesByParentId(-1));
        return "pages/back/goods/goods-addPre";
    }

    @PostMapping("add")
    @ResponseBody
    Map<String,Object> add(Goods goods){
        return goodsService.add(goods);
    }

    @RequestMapping("getGoodsByTypeId/{typeId}")
    @ResponseBody
    ResponseDTO getGoodsByTypeId(@PathVariable Integer typeId){
        return goodsService.getGoodsByTypeId(typeId);
    }
}
