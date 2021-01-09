package ru.itis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QueryDslApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(QueryDslApplication.class, args);
    }
}
