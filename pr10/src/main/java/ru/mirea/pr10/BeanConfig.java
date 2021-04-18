package ru.mirea.pr10;

import org.springframework.context.annotation.Bean;
import ru.mirea.pr10.components.Junior;
import ru.mirea.pr10.components.Middle;
import ru.mirea.pr10.components.Senior;

public class BeanConfig {
    @Bean
    public Junior junior(){
        return new Junior();
    }

    @Bean
    public Middle middle(){
        return new Middle();
    }

    @Bean
    public Senior senior(){
        return new Senior();
    }
}
