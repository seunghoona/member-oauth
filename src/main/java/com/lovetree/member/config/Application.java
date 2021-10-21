package com.lovetree.member.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application {
    @GetMapping("/")
    public String get(){
        return "ok";
    }

    @GetMapping("/info")
    public String getInfo(){
        return "ok";
    }
}
