package chapter05.section07;

import java.util.stream.Stream;

public class GenerateDemo {

    public static void main(String[] args) {
        Stream.generate(Math::random)
            .limit(5)
            .forEach(System.out::println);
    }
}