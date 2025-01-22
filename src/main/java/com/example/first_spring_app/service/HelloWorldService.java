package com.example.first_spring_app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@Service
public class HelloWorldService {
    public String helloWorld(String name ) {
        return "Hello, World! " + name;
    }
}
