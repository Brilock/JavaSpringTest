package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthController {

    @GetMapping("/health")
    @ResponseBody //сообщаем спрингу, что хотим записать свой java-объект HealthStatus в HttpResponse (в виде xml или json)
    public HealthStatus health() {
        return new HealthStatus(); //возвращаем java объект, а не строковую ссылку на представление
    }
}
