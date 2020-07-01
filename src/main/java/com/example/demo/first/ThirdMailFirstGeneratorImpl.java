package com.example.demo.first;

import com.example.demo.first.MailFirstGenerator;
import org.springframework.stereotype.Component;

@Component("3")
public class ThirdMailFirstGeneratorImpl implements MailFirstGenerator {
    @Override
    public String generateMail() {
        return "third@gmail.com";
    }
}
