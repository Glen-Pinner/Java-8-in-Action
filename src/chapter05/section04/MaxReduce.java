package chapter05.section04;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxReduce {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

        Optional<Integer> max = numbers.stream().reduce(Integer::max);

        max.ifPresent(x -> System.out.println(x));
    }
}
