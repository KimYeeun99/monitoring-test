package com.test.monitoring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping("/api")
public class MonitorController {
    @GetMapping("/monitor1")
    public String test1(){
        log.info("[Info] log정보입니다.");
        return "Monitoring Test1";
    }

    @GetMapping("/monitor2")
    public String test2(){
        log.warn("[Info] log 위험 정보입니다.");
        return "Monitoring Test2";
    }
}
