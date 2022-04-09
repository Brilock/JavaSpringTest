package com.example.demo;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao {

    private DataSource dataSource;

    public UserDao(MySqlDataSource dataSource) {

    }

    public User findById(Integer id) {
        try(Connection connection = dataSource.getConnection()) {
            PreparedStatement selectStatement = connection.prepareStatement("");
        } catch (Exception e) { }
        return null;
    }
}
