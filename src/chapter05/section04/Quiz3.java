package chapter05.section04;

import chapter05.Dish;
import chapter05.Menu;

import java.util.List;

public class Quiz3 {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        // My solution but relies on a method on dish with an integer result. NOT GOOD
//        int count = menu.stream()
//            .map(d -> d.getCalories())
//            .reduce(0, (a, b) -> a += 1);

        int count = menu.stream()
            .map(d -> 1)
            .reduce(0, (a, b) -> a + b);

        System.out.println(count);

        // N.B. menu.stream().count() is the simplest way.
    }
}
