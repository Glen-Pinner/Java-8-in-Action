package chapter05.section07;

import java.util.stream.Stream;

public class Quiz4 {

    public static void main(String[] args) {
        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
            .limit(10)
            .forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));
    }
}
