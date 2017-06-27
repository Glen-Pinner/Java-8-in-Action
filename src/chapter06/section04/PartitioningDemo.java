package chapter06.section04;

import chapter06.Dish;
import chapter06.Menu;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class PartitioningDemo {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        Map<Boolean, List<Dish>> partitionedMenu = menu.stream()
            .collect(partitioningBy(Dish::isVegetarian));
        System.out.println(partitionedMenu);

        List<Dish> vegetarianDishes = partitionedMenu.get(true);
        System.out.println("Vegetarian dishes: " + vegetarianDishes);

        Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType = menu.stream()
            .collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
        System.out.println(vegetarianDishesByType);
    }
}
