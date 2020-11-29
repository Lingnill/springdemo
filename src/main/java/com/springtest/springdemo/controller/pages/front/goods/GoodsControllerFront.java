package com.springtest.springdemo.controller.pages.front.goods;

import com.springtest.springdemo.pojo.dto.ResponseDTO;
import com.springtest.springdemo.pojo.entity.Goods;
import com.springtest.springdemo.service.GoodsService;
import com.springtest.springdemo.service.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author lingnill
 */
@Controller
@RequestMapping("/pages/front/goods")
public class GoodsControllerFront {
    @Resource
    GoodsService goodsService;

    @GetMapping("goodsDetail/{goodsId}")
    String goodsDetail(@PathVariable Integer goodsId,Model model){
        model.addAttribute("goodsId",goodsService.getGoodsDetail(goodsId));
        return "pages/front/goods/goods-detail";
    }

}