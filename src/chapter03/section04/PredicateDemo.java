package chapter03.section04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Bilbo Baggins", "", "Frodo Baggins", "Gollum");

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(strings, nonEmptyStringPredicate);

        System.out.println(nonEmpty);
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
}
