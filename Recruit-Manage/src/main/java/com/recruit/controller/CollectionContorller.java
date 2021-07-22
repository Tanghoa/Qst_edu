package com.recruit.controller;

import com.alibaba.fastjson.JSON;
import com.recruit.dao.Web_CollectionMapper;
import com.recruit.entity.Web_Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/collection")
public class CollectionContorller {

    @Autowired
    Web_CollectionMapper web_collectionMapper;

    @RequestMapping("/test")
    @ResponseBody
    public  String getTEST(){

        Web_Collection collection = web_collectionMapper.selectByPrimaryKey(1);

        String coll = JSON.toJSONString(collection);

        return coll;


    }
}
