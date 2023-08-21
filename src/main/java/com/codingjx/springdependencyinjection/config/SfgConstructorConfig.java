package com.codingjx.springdependencyinjection.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

//@ConstructorBinding
@ConfigurationProperties("codingjx")
public class SfgConstructorConfig {
    private final String username;
    private final String password;
    private final String jdbcUrl;

    public SfgConstructorConfig(String username, String password, String jdbcUrl) {
        this.username = username;
        this.password = password;
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
