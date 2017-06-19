package chapter04.section04;

import chapter04.Dish;
import chapter04.Menu;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoPrinter {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        List<String> threeHighColoricDishNames = menu.stream()
            .filter(d -> {
                System.out.println("Filtering " + d.getName());
                return d.getCalories() > 300;
            })
            .map(d -> {
                System.out.println("Mapping " + d.getName());
                return d.getName();
            })
            .limit(3)
            .collect(Collectors.toList());

        System.out.println(threeHighColoricDishNames);
    }


}
