package com.springtest.springdemo.controller.pages.front;

import com.springtest.springdemo.pojo.entity.User;
import com.springtest.springdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author lingnill
 */
@Controller
@RequestMapping("/pages/front")
public class LoginController {
    @Resource
    UserService userService;
    @RequestMapping("loginPage")
    String loginPage(){
        return "pages/front/login/loginPage";
    }
    @RequestMapping("login")
    String login(User user, Model model){
        if ("".equals(user.getPhone())||user.getPhone()==null){
            model.addAttribute("errorMsg","请输入手机号！");
        }
        boolean loginResult=userService.login(user);
        if (loginResult){
            return "pages/back/home";
        }
        model.addAttribute("errorMsg","登录失败！手机号或密码错误。");
        return "pages/front/login/loginPage";
    }
}

