package chapter05.section01;

import chapter05.Dish;
import chapter05.Menu;

import java.util.List;
import java.util.stream.Collectors;

public class Quiz1 {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        List<Dish> meatDishes = menu.stream()
                                    .filter(d -> d.getType() == Dish.Type.MEAT)
                                    .limit(2)
                                    .collect(Collectors.toList());

        System.out.println(meatDishes);
    }
}
