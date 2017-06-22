package chapter05.section04;

import java.util.Arrays;
import java.util.List;

public class SumReduce {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

        int sum = numbers.stream().reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
