package com.example.demo;

import com.example.demo.first.MailFirstGenerator;
import com.example.demo.second.MailSecondGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestService {

    @Autowired
    private Map<String, MailFirstGenerator> mailFirstGeneratorMap;

    private Map<String, MailSecondGenerator> mailSecondGeneratorMap = new HashMap<>();

    public void register(String code, MailSecondGenerator mailSecondGenerator) {
        mailSecondGeneratorMap.put(code, mailSecondGenerator);
    }

    public String generateFirstAnswer(String id) {
        MailFirstGenerator mailFirstGenerator = mailFirstGeneratorMap.get(id);
        return mailFirstGenerator.generateMail();
    }

    public String generateSecondAnswer(String id) {
        MailSecondGenerator mailSecondGenerator = mailSecondGeneratorMap.get(id);
        return mailSecondGenerator.generateMail();
    }
}
