package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserService {

    @Transactional //говорит о том, что для данного метода требуется открытое соединение с базой данных
    public User activateUser(Integer id) {
        //SQL-заброс для обновления состояния пользователя в базе данных
        return new User();
    }
}
