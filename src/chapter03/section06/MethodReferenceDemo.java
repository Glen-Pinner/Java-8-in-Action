package chapter03.section06;

import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparing;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
            new Apple(80, "green"),
            new Apple(155, "green"),
            new Apple(120, "red"));

        apples.sort(comparing(Apple::getWeight));

        System.out.println(apples);
    }
}
