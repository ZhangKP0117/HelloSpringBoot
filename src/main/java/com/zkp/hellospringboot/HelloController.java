package com.zkp.hellospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name){

        String msg = "hello,"+name;

        System.out.println(msg);

        return msg;

    }
}
