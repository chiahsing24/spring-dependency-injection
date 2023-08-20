package com.codingjx.springdependencyinjection.service;

public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter Injected";
    }
}
