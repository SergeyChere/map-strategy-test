package com.example.demo.second;

import com.example.demo.TestService;
import org.springframework.beans.factory.annotation.Autowired;

public interface MailSecondGenerator {
    String generateMail();
    String getMyCode();
    @Autowired
    default void registerMyself(TestService testService) {
        testService.register(getMyCode(), this);
    }
}
