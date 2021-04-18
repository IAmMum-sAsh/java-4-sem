package ru.mirea.pr10.components;

import org.springframework.stereotype.Component;
import ru.mirea.pr10.Programmer;

@Component
public class Senior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("SENIOR is coding");
    }
}
