package com.yrkim.second.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/second-service")
public class SecondServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the First service";
    }

    // message 메서드 추가
    @GetMapping("/message")
    public String message(@RequestHeader("second-request") String header) {
        log.info("second-request : {}",header);
        return "Hello World in Second Service.";
    }

    @GetMapping("/check")
    public String check() {
        log.info("first-request check");
        return "Hi, there. This is a message from Second Service";
    }
}
