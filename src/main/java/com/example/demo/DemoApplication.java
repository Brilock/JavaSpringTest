package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);

        Environment env = ctx.getEnvironment(); //узнаем окружение
        String databaseUrl = env.getProperty("database.url"); //Обращаемся к среде, где запущено приложение
        boolean containsPassword = env.containsProperty("datavase.password"); //обращаемся к properties

        /*Resource aClasspathTemplate = ctx.getResource("classpath:somePackage/application.properties"); //ищем файл в нашем application classpath
        Resource aFileTemplate = ctx.getResource("file:///someDirectory/application.properties"); //ищем файл на нашем жестком диске
        Resource anHttpTemplate = ctx.getResource("https://marcobehler.com/application.properties"); //ищем файл в интернете
        Resource depends = ctx.getResource("myhost.com/resource/path/myTemplate.txt"); //зависит от типа контекста приложения (разбираться)
        Resource s3Resources = ctx.getResource("s3://myBucket/myFile.txt"); //обращение к путям напрямую, например, с помощью Spring Cloud*/

        //DataSource dataSource = ctx.getBean(DataSource.class);
        //SpringApplication.run(DemoApplication.class, args);
    }

}
