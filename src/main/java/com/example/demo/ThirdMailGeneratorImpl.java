package com.example.demo;

import org.springframework.stereotype.Component;

@Component("3")
public class ThirdMailGeneratorImpl implements MailGenerator {
    @Override
    public String generateMail() {
        return "third@gmail.com";
    }
}
