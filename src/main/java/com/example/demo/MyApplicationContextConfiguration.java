package com.example.demo;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@PropertySources( //Определяем источники property
        {@PropertySource("classpath:/com/${my.placeholder:default/path}/app.properties"),
         @PropertySource("file://myFolder/app-production.properties")})
public class MyApplicationContextConfiguration {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
