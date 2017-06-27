package chapter06.section05;

import chapter06.Dish;
import chapter06.Menu;

import java.util.List;
import static java.util.stream.Collectors.*;

public class ToListCollectorDemo {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        List<Dish> dishes = menu.stream()
            .collect(new ToListCollector<Dish>());
        System.out.println(dishes);
    }
}
