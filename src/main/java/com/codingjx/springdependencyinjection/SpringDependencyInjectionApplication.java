package com.codingjx.springdependencyinjection;

import com.codingjx.springdependencyinjection.controller.ConstructorInjectedController;
import com.codingjx.springdependencyinjection.controller.MyController;
import com.codingjx.springdependencyinjection.controller.PropertyInjectedController;
import com.codingjx.springdependencyinjection.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("------------ Primary Bean");
        System.out.println(myController.sayHello());

//        String greeting = myController.sayHello();
//        System.out.println(greeting);

        System.out.println("------------ Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------------ Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------------ Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
