package com.learn.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/test")
    public Object testTime(){
        Map<String, Object> map = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        map.put("profile","Production");
        map.put("time",sdf.format(new Date()));
        return map;
    }
}
