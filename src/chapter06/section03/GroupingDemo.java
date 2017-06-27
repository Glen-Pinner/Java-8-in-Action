package chapter06.section03;

import chapter06.Dish;
import chapter06.Menu;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class GroupingDemo {

    public enum CaloricLevel { DIET, NORMAL, FAT };

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        Map<Dish.Type, List<Dish>> dishes = menu.stream()
            .collect(groupingBy(Dish::getType));
        System.out.println(dishes);

        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream()
            .collect(groupingBy(dish -> {
                if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                else return CaloricLevel.FAT;
            }));
        System.out.println(dishesByCaloricLevel);
    }
}
