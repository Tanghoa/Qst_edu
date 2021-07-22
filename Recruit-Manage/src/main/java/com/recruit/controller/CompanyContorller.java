package com.recruit.controller;

import com.alibaba.fastjson.JSON;
import com.recruit.dao.CompanyMapper;
import com.recruit.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/company")
public class CompanyContorller {

    @Autowired
    CompanyMapper companyMapper;

    @RequestMapping("/test")
    @ResponseBody
    public String testCe(){

        Company company = companyMapper.selectByPrimaryKey(1);
        String com = JSON.toJSONString(company);
        return com;

    }
}
