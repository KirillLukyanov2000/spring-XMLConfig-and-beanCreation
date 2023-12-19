package ru.lukyanov.XMLConfigExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lukyanov.XMLConfigExample.entity.User;
import ru.lukyanov.XMLConfigExample.service.UserService;

import java.util.Arrays;
import java.util.Optional;

public class XMLConfigRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        UserService userService = context.getBean(UserService.class);
        Optional<User> user = userService.getUserById(1L);
        System.out.println(user);

    }
}
