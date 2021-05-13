package ru.mirea.pr13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class Pr13Application {
    public static void main(String[] args) {
        SpringApplication.run(Pr13Application.class, args);
    }

}
