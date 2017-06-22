package chapter05.section06;

import java.util.stream.IntStream;

public class RangeDemo {

    public static void main(String[] args) {
        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
            .filter(n -> n % 2 == 0);

        System.out.println(evenNumbers.count());
    }
}
