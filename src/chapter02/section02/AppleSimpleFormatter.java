package chapter02.section02;

public class AppleSimpleFormatter implements AppleFormatter {

    @Override
    public String accept(Apple a) {
        return "An apple of " + a.getWeight() + "g";
    }
}
