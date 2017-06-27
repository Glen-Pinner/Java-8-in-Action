package chapter06.section02;

import chapter06.Dish;
import chapter06.Menu;

import java.util.IntSummaryStatistics;
import java.util.List;
import static java.util.stream.Collectors.*;

public class SummarisationDemo {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));
        System.out.println("Total calories in menu: " + totalCalories);

        double avgCalories = menu.stream().collect(averagingInt(Dish::getCalories));
        System.out.println("Average calories per dish in menu: " + avgCalories);

        IntSummaryStatistics menuStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println("Summary statistics on calories in menu: " + menuStatistics);
    }
}
