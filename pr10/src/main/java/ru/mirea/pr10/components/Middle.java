package ru.mirea.pr10.components;

import org.springframework.stereotype.Component;
import ru.mirea.pr10.Programmer;

@Component
public class Middle implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("MIDDLE is coding");
    }
}
