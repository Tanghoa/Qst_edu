package com.recruit.controller;

import com.recruit.dao.AdminMapper;
import com.recruit.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    AdminMapper adminMapper;


    @RequestMapping("/user/login")
    public String dologin(
            @RequestParam("username") String username
            , @RequestParam("password") String password
            ,HttpServletRequest request){

        Admin admin = new Admin(null, username, password);
        System.out.println(admin);
        request.setAttribute("user",admin);
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
    public String test(){
        Admin admin = adminMapper.selectByPrimaryKey(1);
        System.out.println(admin);
        return "index";
    }
}
