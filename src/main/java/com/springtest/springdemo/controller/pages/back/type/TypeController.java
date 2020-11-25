package com.springtest.springdemo.controller.pages.back.type;

import com.springtest.springdemo.pojo.dto.ResponseDTO;
import com.springtest.springdemo.pojo.entity.GoodsType;
import com.springtest.springdemo.service.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author lingnill
 */
@Controller
@RequestMapping("/pages/back/type")
public class TypeController {
    @Resource
    TypeService typeService;

    @RequestMapping("addPre")
    String addPre(Model model){
        model.addAttribute("types",typeService.selectTypesByParentId(-1));
        return "pages/back/type/type-addPre";
    }
    @PostMapping("add")
    @ResponseBody
    ResponseDTO add(GoodsType goodsType){
        return typeService.add(goodsType);
    }
}
