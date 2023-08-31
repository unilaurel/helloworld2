package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Package: com.itheima.controller
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/31 21:30
 * @Version 1.0
 */
@RequestMapping("/hello")
@RestController
public class HelloController {
    @GetMapping
    public String hello(){
        System.out.println("hello world ...");
        return "OK";
    }
}
