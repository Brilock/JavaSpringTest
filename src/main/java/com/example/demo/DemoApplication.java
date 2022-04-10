package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
        //ClassPathXmlApplicationContext - из файла xml
        UserDao userDao = ctx.getBean(UserDao.class);
        //User user = userDao.findById(1);

        DataSource dataSource = ctx.getBean(DataSource.class);

        //SpringApplication.run(DemoApplication.class, args);
    }

}
