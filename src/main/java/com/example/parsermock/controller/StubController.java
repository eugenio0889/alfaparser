package com.example.parsermock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stub")
public class StubController {

    @GetMapping
    public String getGreeting() {
        return "Hello, World";
    }
}
