package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GrettingController {

    @GetMapping("greeting")
    public String greeting(Map<String, Object> model){
        model.put("message", "Hello Pablo");
        return "greeting";
    }

    @GetMapping("thyme")
    public String thyme(Map<String, Object> model){
        model.put("message", "Hello ThymeLeaf");
        return "thyme";
    }
}
