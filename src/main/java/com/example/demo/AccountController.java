package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller //Говорим спрингу, что этот класс хочет реагировать на HTTP-запросы и ответы
//Чтобы DispatcherServlet знал об этом
public class AccountController {

    @GetMapping("/account/{userId}") //Сообщаем диспатчеру, что запросы /account/{userId} должны обрабатываться именно этим методом контроллера
    public String account(Model model, @PathVariable Integer userId) {
        //model.addAttribute("user",userDao.findById(userId)); //Конкатенация для подстановки в шаблоне страницы
        return "templates/account"; //возвращаем ссылку на представление (HTML шаблон)
    }
}
