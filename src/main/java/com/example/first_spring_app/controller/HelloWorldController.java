package com.example.first_spring_app.controller;

import com.example.first_spring_app.domain.User;
import com.example.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

//    public HelloWorldController(HelloWorldService helloWorldService){
//        this.helloWorldService = helloWorldService;
//    }

    // get, post, delete, put, patch, options, head
    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Abdiel");
    }


    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestBody User body) {
        return "Hello World " + body.getName() + id;
    }

}
