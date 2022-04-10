package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MyApplicationContextConfiguration {

    @Bean
    public DataSource dataSource() {
        MySqlDataSource dataSource = new MySqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("s3cr3t");
        dataSource.setURL("jdbc:mysql://localhost:3306/myDatabase");
        return dataSource;
    }

    @Bean
    public UserDao userDao() {
        return new UserDao((MySqlDataSource)dataSource());
    }
}
