package com.codingjx.springdependencyinjection.config;

import com.codingjx.springdependencyinjection.service.ConstructorGreetingService;
import com.codingjx.springdependencyinjection.service.PropertyInjectedGreetingService;
import com.codingjx.springdependencyinjection.service.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }

}
