package com.company.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.project.models.YpcOrderInfo;
import com.company.project.models.YpcOrderInfoRepository;

import java.util.Optional;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/orders") // This means URL's start with /demo (after Application path)
public class OrderController {

    @Autowired

    private YpcOrderInfoRepository orderInfoRepository;

    @GetMapping(path = "/lists")
    public @ResponseBody Iterable <YpcOrderInfo> getAllOrder() {
        return orderInfoRepository.findAll();
    }

    @GetMapping(path = "/detail/{id}")
    public @ResponseBody Optional<YpcOrderInfo> getDetail(@RequestParam Integer id) {
        return orderInfoRepository.findById(id);
    }



}
