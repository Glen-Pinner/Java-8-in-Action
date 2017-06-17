package chapter03.section08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ComposingPredicates {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
            new Apple(80, "green"),
            new Apple(120, "green"),
            new Apple(155, "red"),
            new Apple(135, "green"),
            new Apple(120, "red"));

        List<Apple> redApples = filter(apples, (Apple a) -> "red".equals(a.getColour()));
        System.out.println(redApples);

//        Apple redApple = findFirst(apples, (Apple a) -> "red".equals(a.getColour()));
//        System.out.println(redApple);

        Predicate<Apple> greenApple = (Apple a) -> "green".equals(a.getColour());
        Predicate<Apple> greenAndSlightlyHeavy = greenApple.and(a -> a.getWeight() > 120);

        List<Apple> greenAndSlightlyHeavyApples = filter(apples, greenAndSlightlyHeavy);
        System.out.println(greenAndSlightlyHeavyApples);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();

        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }

        return results;
    }

    public static <T> T findFirst(List<T> list, Predicate<T> p) {
        T result = null;

        for (T s : list) {
            if (p.test(s)) {
                return result = s;
            }
        }

        return result;
    }
}
