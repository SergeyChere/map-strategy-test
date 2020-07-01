package com.example.demo.second;

import org.springframework.stereotype.Component;

@Component("5")
public class FifthMailSecondGeneratorImpl implements MailSecondGenerator {
    @Override
    public String generateMail() {
        return "fifth@gmail.com";
    }

    @Override
    public String getMyCode() {
        return "5";
    }
}
