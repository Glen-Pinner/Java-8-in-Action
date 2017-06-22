package chapter05.section03;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> firstSquareDivisibleByThree = numbers
            .stream()
            .map(x -> x * x)
            .filter(x -> x % 3 == 0)
            .findFirst();

        firstSquareDivisibleByThree.ifPresent(x -> System.out.println(x));
    }
}
