package chapter06.section03;

import chapter06.Dish;
import chapter06.Menu;

import java.util.*;

import static java.util.stream.Collectors.*;

public class Subgroups {

    public enum CaloricLevel {DIET, NORMAL, FAT}

    ;

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        Map<Dish.Type, Long> typesCount = menu.stream()
            .collect(groupingBy(Dish::getType, counting()));
        System.out.println(typesCount);

        Map<Dish.Type, Optional<Dish>> mostCaloricByType = menu.stream()
            .collect(groupingBy(Dish::getType, maxBy(Comparator.comparingInt(Dish::getCalories))));
        System.out.println(mostCaloricByType);

        Map<Dish.Type, Dish> mostCaloricByTypeNoOptionals = menu.stream()
            .collect(groupingBy(Dish::getType,
                collectingAndThen(
                    maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(mostCaloricByTypeNoOptionals);

        Map<Dish.Type, Set<CaloricLevel>> caloricLevelsByType = menu.stream()
            .collect(groupingBy(Dish::getType,
                mapping(dish -> {
                    if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                    else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
//                }, toSet())));
                }, toCollection(HashSet::new) )));
        System.out.println(caloricLevelsByType);
    }
}
