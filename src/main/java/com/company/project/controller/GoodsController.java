package com.company.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/goods") // This means URL's start with /demo (after Application path)
public class GoodsController {

    @GetMapping(path = "/lists")
    public @ResponseBody String getLists(@RequestParam String phone, @RequestParam String password){
        String md5Password = password;
        return md5Password;
    }

    @GetMapping(path = "/detail")
    public @ResponseBody String getDetail(@RequestParam String goodsId){
        String md5Password = goodsId;
        return md5Password;
    }

    @GetMapping(path = "/cancel")
    public @ResponseBody String getCancelOrder(@RequestParam String orderId){
        return orderId;
    }

}
