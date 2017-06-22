package chapter05.section01;

import chapter05.Dish;
import chapter05.Menu;

import java.util.List;
import java.util.stream.Collectors;

public class SkipDemo {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        List<Dish> dishes = menu.stream()
                                .filter(d -> d.getCalories() > 300)
                                .skip(2)
                                .collect(Collectors.toList());

        System.out.println(dishes);
    }
}
