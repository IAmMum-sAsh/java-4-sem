package pr2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;
import java.time.LocalDate;

public class Test {

    public static void main(String[] args){
        ArrayList<Human> input = new ArrayList<>();
        input.add(new Human(19, "Nat", "Vit", LocalDate.of(2001, 6, 22), 47));
        input.add(new Human(13, "Mar", "Vit", LocalDate.of(2007, 12, 13), 52));
        input.add(new Human(5, "Kat", "Vit", LocalDate.of(2015, 8, 7), 17));
        input.add(new Human(20, "Иван", "Иванов", LocalDate.of(2000, 2, 29), 72));
        input.add(new Human(20, "Kat", "Cher", LocalDate.of(2001, 1, 2), 45));
        input.add(new Human(19, "Nik", "Kli", LocalDate.of(2001, 8, 29), 65));

        Stream<Human> stream = input.stream();
        System.out.println("Инициализация:");
        stream.forEach(System.out::println);

        stream = input.stream();
        System.out.println("\nОбратная сортировка по весу:");
        stream.sorted(Comparator.comparingInt(Human::getWeight).reversed()).forEach(System.out::println);

        stream = input.stream();
        System.out.println("\nНе Иванов:");
        stream.filter(a -> !a.getLastName().equals("Иванов")).forEach(System.out::println);

        stream = input.stream();
        System.out.println("\nСортировка по возрасту:");
        stream.sorted(Comparator.comparingInt(Human::getAge)).forEach(System.out::println);

        stream = input.stream();
        System.out.println("\nПроизведение всех возрастов:");
        ArrayList<Integer> listOfAge = new ArrayList<>();
        stream.forEach(a -> {listOfAge.add(a.getAge());});
        System.out.println(listOfAge.stream().reduce((a, b) -> a * b));
    }
}
