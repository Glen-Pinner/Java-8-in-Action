package chapter03.section08;

public class Letter {

    public static String addHeader(String text) {
        return "From Glen: " + text;
    }

    public static String addFooter(String text) {
        return text + " Kind regards";
    }
    public static String checkSpelling(String text) {
        return text.replaceAll("labda", "lambda");
    }

}
