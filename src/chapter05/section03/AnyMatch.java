package chapter05.section03;

import chapter05.Dish;
import chapter05.Menu;

import java.util.List;

public class AnyMatch {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        if (menu.stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is (somewhat) vegetarian friendly!");
        }
    }
}
