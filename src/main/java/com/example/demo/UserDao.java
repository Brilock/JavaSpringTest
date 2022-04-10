package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

@Component //определили, что класс будет bean-компонентом Spring, управляемым извне
public class UserDao {

    //@Autowired так тоже можно, но не рекомендуется
    private DataSource dataSource;

    //Аннотация Autowired укажет, что именно будет подставляться, но добавлять её необязательно
    public UserDao(/*@Autowired*/ DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public User findById(Integer id) {
        try(Connection connection = dataSource.getConnection()) {
            PreparedStatement selectStatement = connection.prepareStatement("");
        } catch (Exception e) { }
        return null;
    }
}
