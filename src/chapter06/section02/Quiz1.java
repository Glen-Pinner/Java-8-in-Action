package chapter06.section02;

import chapter06.Dish;
import chapter06.Menu;

import java.util.List;
import static java.util.stream.Collectors.*;

public class Quiz1 {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        String shortMenu = menu.stream().map(Dish::getName).collect(joining(", "));
        System.out.println(shortMenu);

        shortMenu = menu.stream().map(Dish::getName)
            .collect(reducing((s1, s2) -> s1 + s2)).get();
        System.out.println(shortMenu);

//        shortMenu = menu.stream()
//            .collect(reducing((d1, d2) -> d1.getName() + d2.getName())).get();
//        System.out.println(shortMenu);

        shortMenu = menu.stream()
            .collect(reducing("", Dish::getName, (s1, s2) -> s1 + s2));
        System.out.println(shortMenu);
    }
}
