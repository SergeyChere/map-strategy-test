package com.example.demo.first;

import org.springframework.stereotype.Component;

@Component("2")
public class SecondMailFirstGeneratorImpl implements MailFirstGenerator {
    @Override
    public String generateMail() {
        return "second@gmail.com";
    }
}
