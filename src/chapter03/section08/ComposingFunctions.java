package chapter03.section08;

import java.util.function.Function;

public class ComposingFunctions {

    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        Function<Integer, Integer> h = f.andThen(g);

        int result = h.apply(1);
        System.out.println("Result of g(f(1)): " + result);

        // Or using compose() - f(g(x)) or (f o g)(x)
        result = f.compose(g).apply(1);
        System.out.println("Result of f(g(1)): " + result);

        // Example of a transformation pipeline
        Function<String, String> addHeader = Letter::addHeader;
        Function<String, String> transformationPipeline = addHeader
            .andThen(Letter::checkSpelling)
            .andThen((Letter::addFooter));

        String text = "A labda expression is awesome!";
        System.out.println(text);

        // Using the transformation pipeline...
        text = transformationPipeline.apply(text);
        System.out.println(text);
    }
}
