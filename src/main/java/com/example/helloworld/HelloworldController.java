package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloworldController {
    @GetMapping("/")
    public String getWelcomeText() {
        return "Hello Word!";
    }

    @GetMapping("/name")
    public String getName() {
        return "Rahul Attuluri";
    }
}
