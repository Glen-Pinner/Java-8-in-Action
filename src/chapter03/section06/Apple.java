package chapter03.section06;

public class Apple {

    private double weight;
    private String colour;

    public Apple(double weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
            "weight=" + weight +
            ", colour='" + colour + '\'' +
            '}';
    }
}
