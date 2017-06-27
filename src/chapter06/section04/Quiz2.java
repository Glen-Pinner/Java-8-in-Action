package chapter06.section04;

import chapter06.Dish;
import chapter06.Menu;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class Quiz2 {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        Map<Boolean, Map<Boolean, List<Dish>>> highCaloricDishes = menu.stream()
            .collect(partitioningBy(Dish::isVegetarian,
                partitioningBy(d -> d.getCalories() > 500)));
        System.out.println(highCaloricDishes);

        Map<Boolean, Long> caloriesByDishType = menu.stream()
            .collect(partitioningBy(Dish::isVegetarian, counting()));
        System.out.println(caloriesByDishType);
    }
}
