package com.example.logManagementLab.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;

@RestController
public class Example {
    Logger logger = LoggerFactory.getLogger(Example.class);

    @GetMapping("/hello")
    public String hello() {
        logger.info("Hello method called");
        return "Hello World";
    }
}
