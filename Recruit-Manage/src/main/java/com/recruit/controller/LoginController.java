package com.recruit.controller;

import com.alibaba.fastjson.JSON;
import com.recruit.dao.UserMapper;
import com.recruit.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    UserMapper userMapper;


    @RequestMapping("/user/login")
    public String dologin(
            @RequestParam("username") String username
            , @RequestParam("password") String password
            ,HttpServletRequest request){

//        Admin admin = new Admin(1, username, password);
//        System.out.println(admin);
//        request.setAttribute("user",admin);
        return "login";
    }



    @RequestMapping("/to-login")
    public String tologin(HttpServletRequest request){
        request.setAttribute("user","zs");
        return "login";
    }

    @RequestMapping("/")
    public String login(HttpServletRequest request){
        if(request.getAttribute("user") != null){
            return "redirect:/rlogin";
        }
       return "index";
    }

    @RequestMapping("/rlogin")
    public String checkLogin(){


        return "login";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
//        Admin admin = adminMapper.selectByPrimaryKey(1);
        User user = userMapper.selectByPrimaryKey(1);
        String msg = JSON.toJSONString(user);
//        System.out.println(admin);
        return msg;
    }
}
