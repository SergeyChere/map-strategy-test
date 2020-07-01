package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TestService {

    @Autowired
    private Map<String, MailGenerator> mailGeneratorMap;

    public String generateAnswer(String id) {
        MailGenerator mailGenerator = mailGeneratorMap.get(id);
        return mailGenerator.generateMail();
    }
}
