package com.max.controller;

//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
     @RequestMapping("/hello")
        public String hello(){
            System.out.println("Hello,World!");
            return "Hello,Max!";
        }
    }

