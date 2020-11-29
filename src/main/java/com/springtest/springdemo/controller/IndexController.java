package com.springtest.springdemo.controller;
import com.springtest.springdemo.dao.GoodsMapper;
import com.springtest.springdemo.dao.GoodsTypeMapper;
import com.springtest.springdemo.dao.UserMapper;
import com.springtest.springdemo.pojo.dto.ResponseDTO;
import com.springtest.springdemo.pojo.entity.Goods;
import com.springtest.springdemo.pojo.entity.GoodsType;
import com.springtest.springdemo.pojo.entity.User;
import com.springtest.springdemo.pojo.vo.GoodsTypeVO;
import com.springtest.springdemo.service.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lingnill
 */
@Controller
public class IndexController {
    @Resource
    UserMapper userMapper;
    @Resource
    GoodsMapper goodsMapper;
    @Resource
    GoodsTypeMapper goodsTypeMapper;
    @Resource
    TypeService typeService;
    @RequestMapping("/")
    public String index(Model model) {
        User user = userMapper.selectByPrimaryKey(1);
        model.addAttribute("types",typeService.selectTypesByParentId((-1)));
        return "index";
    }

    @GetMapping(name = "", value = "/user")
    public User getUser() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
        return user;
    }
    @GetMapping(value = "/goods")
    public Goods getGoods(){
        Goods goods = goodsMapper.selectByPrimaryKey(2);
        return goods;
    }
    @GetMapping(value = "/phone")
    public User getPhone(){
        User user = userMapper.selectByPhone("18883362500");
        return user;
    }

    @GetMapping(value = "/goodstype")
    public List<GoodsTypeVO> getGoodsType(){
        List<GoodsTypeVO> goodsType = goodsTypeMapper.selectTypesByParentId(1);
        return goodsType;
    }

    @GetMapping(value = "/goodsid")
    public List<Goods> getGoodsByTypeId(){
        List<Goods> goods = goodsMapper.getGoodsByTypeId(4);
        return goods;
    }
}
