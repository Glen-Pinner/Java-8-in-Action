package chapter05.section02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo {

    public static void main(String[] args) {
        String[] words = { "Hello", "World" };

        List<String> uniqueChars = Arrays.stream(words)
                                        .map(w -> w.split(""))
                                        .flatMap(Arrays::stream)
                                        .distinct()
                                        .collect(Collectors.toList());

        System.out.println(uniqueChars);
    }
}
