package com.example.resourceserverdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //curl -H "Authorization: bearer 7c16b10d-b446-4a00-8633-68dcd53052aa" http://localhost:9090/hello
    @GetMapping("/hello")
    public String hello(){
         return "Hello!";
    }

}
