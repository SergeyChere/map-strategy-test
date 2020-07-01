package com.example.demo.second;

import org.springframework.stereotype.Component;

@Component("4")
public class FourthMailSecondGeneratorImpl implements MailSecondGenerator {
    @Override
    public String generateMail() {
        return "fourth@gmail.com";
    }

    @Override
    public String getMyCode() {
        return "4";
    }
}
