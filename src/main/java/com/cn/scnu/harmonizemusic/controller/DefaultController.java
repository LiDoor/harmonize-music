package com.cn.scnu.harmonizemusic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/hello")
public class DefaultController {

    @GetMapping
    public String welcome(){
        return ("欢迎来到HarmonizeMusic");
    }
}
