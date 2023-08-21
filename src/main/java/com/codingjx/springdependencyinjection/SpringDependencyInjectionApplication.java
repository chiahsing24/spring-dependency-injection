package com.codingjx.springdependencyinjection;

import com.codingjx.springdependencyinjection.config.SfgConfiguration;
import com.codingjx.springdependencyinjection.config.SfgConstructorConfig;
import com.codingjx.springdependencyinjection.controller.*;
import com.codingjx.springdependencyinjection.datasource.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.codingjx.springdependencyinjection", "com.codingjx.pets"})
@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());
        System.out.println();

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());
        System.out.println();

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("------------ Primary Bean");
        System.out.println(myController.sayHello());
        System.out.println();

//        String greeting = myController.sayHello();
//        System.out.println(greeting);
//        System.out.println();

        System.out.println("------------ Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());
        System.out.println();

        System.out.println("------------ Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());
        System.out.println();

        System.out.println("------------ Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
        System.out.println();

        System.out.println("------------ FakeDataSource");
        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getJdbcUrl());
        System.out.println();

        System.out.println("------------ FakeDataSource Config Props Bean");
        SfgConfiguration sfgConfiguration = ctx.getBean(SfgConfiguration.class);
        System.out.println(sfgConfiguration.getUsername());
        System.out.println(sfgConfiguration.getPassword());
        System.out.println(sfgConfiguration.getJdbcUrl());
        System.out.println();

        System.out.println("------------ FakeDataSource Constructor Config Binding");
        SfgConstructorConfig sfgConstructorConfig = ctx.getBean(SfgConstructorConfig.class);
        System.out.println(sfgConstructorConfig.getUsername());
        System.out.println(sfgConstructorConfig.getPassword());
        System.out.println(sfgConstructorConfig.getJdbcUrl());
        System.out.println();


    }

}
