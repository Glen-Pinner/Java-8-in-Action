package chapter05.section02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Quiz2 {

    public static void main(String[] args) {
        // Question 1.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5 );
        List<Integer> squares = numbers.stream()
                                    .map(n -> n * n)
                                    .collect(toList());

        System.out.println(squares);

        // Question 2.
        List<Integer> numList1 = Arrays.asList(1, 2, 3);
        List<Integer> numList2 = Arrays.asList(3, 4);

        List<int[]> tuples = numList1.stream()
                                    .flatMap(i -> numList2.stream()
                                                          .map(j -> new int[]{i, j}))
                                    .collect(toList());

        System.out.println(tuples);
    }
}
