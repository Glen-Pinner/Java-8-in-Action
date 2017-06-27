package chapter06.section02;

import chapter06.Dish;
import chapter06.Menu;

import java.util.List;
import static java.util.stream.Collectors.*;

public class JoiningStrings {

    public static void main(String[] args) {
        List<Dish> menu = Menu.createMenu();

        String shortMenu = menu.stream().map(Dish::getName).collect(joining(", "));
        System.out.println(shortMenu);
    }
}
