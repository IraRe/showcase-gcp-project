package com.irare.climate.change.measurementsprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    String helloWorld() {
        return "Hello World!";
    }
}
