package chapter05.section06;

import chapter05.Dish;
import chapter05.Menu;

import java.util.List;
import java.util.OptionalInt;

public class IntStreamDemo {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        int calories = menu.stream()
            .mapToInt(Dish::getCalories)
            .sum();

        System.out.println(calories);

        OptionalInt maxCalories = menu.stream()
            .mapToInt(Dish::getCalories)
            .max();

        int max = maxCalories.orElse(1);

        System.out.println(max);
    }
}
