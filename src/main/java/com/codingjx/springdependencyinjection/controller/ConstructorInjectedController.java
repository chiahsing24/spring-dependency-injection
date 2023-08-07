package com.codingjx.springdependencyinjection.controller;

import com.codingjx.springdependencyinjection.service.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
