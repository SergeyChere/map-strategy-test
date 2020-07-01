package com.example.demo;

import org.springframework.stereotype.Component;

@Component("2")
public class SecondMailGeneratorImpl implements MailGenerator {
    @Override
    public String generateMail() {
        return "second@gmail.com";
    }
}
