package chapter04.section04;

import chapter04.Dish;
import chapter04.Menu;

import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        menu.stream().forEach(System.out::println);
    }
}
