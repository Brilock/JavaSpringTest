package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

@Configuration
@ComponentScan //Позволяет не вручную указывать зависимость userDAO от dataSource
public class MyApplicationContextConfiguration {

    @Bean
    //@Scope("singleton") //Создается 1 источник данных для каждого объекта
    //@Scope("prototype") //Создается новый источник данных для каждого объекта
    //@Scope("session") //Создаются источники данных для каждого сеанса http пользователя
    public DataSource dataSource() {
        MySqlDataSource dataSource = new MySqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("s3cr3t");
        dataSource.setURL("jdbc:mysql://localhost:3306/myDatabase");
        return dataSource;
    }

    /*@Bean //В классе userDAO добавлена аннотация Component, по которой Spring определит bean
    public UserDao userDao() {
        return new UserDao((MySqlDataSource)dataSource());
    }*/
}
