package ru.mirea.pr10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.mirea.pr10.components.Junior;
import ru.mirea.pr10.components.Middle;
import ru.mirea.pr10.components.Senior;

@SpringBootApplication
public class Pr10Application {

	public static void main(String[] args) {
		SpringApplication.run(Pr10Application.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Junior junior = context.getBean(Junior.class);
		junior.doCoding();

		Middle middle = context.getBean(Middle.class);
		middle.doCoding();

		Senior senior = context.getBean(Senior.class);
		senior.doCoding();
	}

}
