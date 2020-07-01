package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PostConstruct;
import java.rmi.registry.Registry;

public interface WhatCouldWorkLikeSecondVariant {

    @PostConstruct
    default void init() {}

    @Scheduled(fixedRate = 1000)
    default void doWork() {}

    @EventListener(ContextRefreshedEvent.class)
    default void doOnce() {}

    @Autowired
    default void register(Registry registry) {
        registry.bind(this.getClass().getName(),this);
    }
}
