package com.test.monitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MonitorController {
    @GetMapping("/monitor1")
    public String test1(){
        return "Monitoring Test1";
    }

    @GetMapping("/monitor2")
    public String test2(){
        return "Monitoring Test2";
    }
}
