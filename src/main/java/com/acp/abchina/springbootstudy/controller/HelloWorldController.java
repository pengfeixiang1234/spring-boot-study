package com.acp.abchina.springbootstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/say")
    public String say() {
        return "Hello World";
    }
}
