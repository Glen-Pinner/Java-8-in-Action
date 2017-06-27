package chapter06.section02;

import chapter06.Dish;
import chapter06.Menu;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import static java.util.stream.Collectors.*;

public class MaxAndMin {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();
        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);

        Optional<Dish> mostCalorieDish = menu.stream()
            .collect(maxBy(dishCaloriesComparator));
        mostCalorieDish.ifPresent(dish -> System.out.println("Dish with most calories: " + dish));

        Optional<Dish> lowestCalorieDish = menu.stream()
            .collect(minBy(dishCaloriesComparator));
        lowestCalorieDish.ifPresent(dish -> System.out.println("Dish with fewest calories: " + dish));
    }
}
