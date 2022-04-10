package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement //Нам нужна поддержка Transactional, которая включает прокси Cglib под капотом
//Можно использовать другие прокси, например, AspectJ
public class MyApplicationContextConfiguration {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
