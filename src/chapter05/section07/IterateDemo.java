package chapter05.section07;

import java.util.stream.Stream;

public class IterateDemo {

    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2)
            .limit(10)
            .forEach(System.out::println);
    }
}
