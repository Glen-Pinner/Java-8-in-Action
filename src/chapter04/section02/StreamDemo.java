package chapter04.section02;

import chapter04.Dish;
import chapter04.Menu;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        List<String> threeHighColoricDishNames = menu.stream()
            .filter(d -> d.getCalories() > 300)
            .map(Dish::getName)
            .limit(3)
            .collect(Collectors.toList());

        System.out.println(threeHighColoricDishNames);
    }


}
