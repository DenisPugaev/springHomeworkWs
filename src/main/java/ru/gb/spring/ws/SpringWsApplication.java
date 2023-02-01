package ru.gb.spring.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWsApplication {


    // Домашнее задание:
    // 1. Добавить  возможность выгрузки всех товаров,
    // и отдельных товаров по имени товара через SOAP

    public static void main(String[] args) {
        SpringApplication.run(SpringWsApplication.class, args);
    }
}
