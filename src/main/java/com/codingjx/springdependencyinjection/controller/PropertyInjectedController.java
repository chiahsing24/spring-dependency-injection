package com.codingjx.springdependencyinjection.controller;

import com.codingjx.springdependencyinjection.service.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
