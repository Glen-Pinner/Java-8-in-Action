package chapter03.section08;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComposingComparators {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
            new Apple(80, "green"),
            new Apple(120, "green"),
            new Apple(80, "green"),
            new Apple(120, "red"),
            new Apple(155, "red"),
            new Apple(135, "red"),
            new Apple(120, "red"),
            new Apple(155, "green"),
            new Apple(120, "red"));

        apples.sort(comparing(Apple::getWeight));
        System.out.println(apples);

        // Reversed order
        apples.sort(comparing(Apple::getWeight).reversed());
        System.out.println(apples);

        // Chaining comparators
        apples.sort(comparing(Apple::getWeight)
            .reversed()
            .thenComparing(Apple::getColour));
        System.out.println(apples);
    }
}
