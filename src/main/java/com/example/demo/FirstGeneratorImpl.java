package com.example.demo;

import org.springframework.stereotype.Component;

@Component("1")
public class FirstGeneratorImpl implements MailGenerator {
    @Override
    public String generateMail() {
        return "first@gmail.com";
    }
}
