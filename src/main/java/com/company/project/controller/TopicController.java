package com.company.project.controller;

import com.company.project.models.YpcTopic;
import com.company.project.models.YpcTopicRepository;
import com.google.common.net.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "/topic")
public class TopicController {

    private YpcTopicRepository ypcTopicRepository;

    @GetMapping (path = "/lists")
    public @ResponseBody Iterable<YpcTopic> getLists(){
        return ypcTopicRepository.findAll();
    }
}
