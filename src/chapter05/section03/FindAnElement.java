package chapter05.section03;

import chapter05.Dish;
import chapter05.Menu;

import java.util.List;
import java.util.Optional;

public class FindAnElement {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        Optional<Dish> dish = menu.stream()
            .filter(Dish::isVegetarian)
            .findAny();

        System.out.println(dish);

        menu.stream()
            .filter(Dish::isVegetarian)
            .findAny()
            .ifPresent(d -> System.out.println(d.getName()));
    }
}
