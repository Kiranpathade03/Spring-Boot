package com.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordControllar {

    //http://localhost:8080/hello-word
    @GetMapping("/hello-word")
    public  String helloWord(){
        return  "Hello Word";
    }

}
