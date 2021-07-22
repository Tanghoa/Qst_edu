package com.recruit.controller;


import com.alibaba.fastjson.JSON;
import com.recruit.dao.ResumeMapper;
import com.recruit.entity.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/resume")
public class ResumeContorller {


    @Autowired
    ResumeMapper resumeMapper;

    @RequestMapping("/test")
    @ResponseBody
    public String getTest(){

       Resume resume = resumeMapper.selectByPrimaryKey(1);
        String res = JSON.toJSONString(resume);


        return  res;
    }

}
