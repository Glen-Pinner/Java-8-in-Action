package chapter02.section02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 80));
        apples.add(new Apple("green", 160));

        prettyPrintApple(apples, new AppleFancyFormatter());
        System.out.println("-------------------");
        prettyPrintApple(apples, new AppleSimpleFormatter());
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple a : inventory) {
            String output = formatter.accept(a);
            System.out.println(output);
        }
    }
}
