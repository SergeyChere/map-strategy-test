package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService someService;

    @GetMapping("/getFirstAnswer/{id}")
    public String getFirstAnswer(@PathVariable("id") String id) {
        return someService.generateFirstAnswer(id);
    }

    @GetMapping("/getSecondAnswer/{id}")
    public String getSecondAnswer(@PathVariable("id") String id) {
        return someService.generateSecondAnswer(id);
    }
}
