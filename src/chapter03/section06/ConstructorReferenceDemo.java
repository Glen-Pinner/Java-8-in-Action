package chapter03.section06;

import java.util.function.BiFunction;

public class ConstructorReferenceDemo {

    public static void main(String[] args) {
        BiFunction<Double, String, Apple> c = Apple::new;
        Apple a = c.apply(85.0, "red");

        System.out.println(a);
    }
}
