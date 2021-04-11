package pr8;

import pr8.iterator.*;
import pr8.mediator.*;

import java.util.Iterator;

public class Test {
    public static void main(String[] args){
        //Итератор
        pr8.iterator.Root root = new Root("конеч");
        Prefix prefix = new Prefix("бес");
        Suffix suffix = new Suffix("н ость");
        Ending ending = new Ending("ю");

        Word word = new Word(root, prefix, suffix, ending);

        Iterator wordIterator = word.iterator();
        while (wordIterator.hasNext()) {
            WordPart part = (WordPart) wordIterator.next();
            System.out.println(part.getClass() + ": " + part.getWordPart());
        }

        System.out.println();

        //Посредник
        ManagerMediator managerMediator = new ManagerMediator();
        Colleague customer = new CustomerColleague(managerMediator);
        Colleague programmer = new ProgrammerColleague(managerMediator);
        Colleague tester = new TesterColleague(managerMediator);

        managerMediator.setCustomer(customer);
        managerMediator.setTester(tester);
        managerMediator.setProgrammer(programmer);

        managerMediator.Send("Приложение готово к тестированию", programmer);

        managerMediator.Send("Есть идея для нового проекта", customer);
    }
}
