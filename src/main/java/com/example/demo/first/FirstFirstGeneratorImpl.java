package com.example.demo.first;

import org.springframework.stereotype.Component;

@Component("1")
public class FirstFirstGeneratorImpl implements MailFirstGenerator {
    @Override
    public String generateMail() {
        return "first@gmail.com";
    }
}
