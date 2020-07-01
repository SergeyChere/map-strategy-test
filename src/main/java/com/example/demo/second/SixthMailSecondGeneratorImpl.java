package com.example.demo.second;

import org.springframework.stereotype.Component;

@Component("6")
public class SixthMailSecondGeneratorImpl implements MailSecondGenerator {
    @Override
    public String generateMail() {
        return "sixth@gmail.com";
    }

    @Override
    public String getMyCode() {
        return "6";
    }
}
