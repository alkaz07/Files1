public class Penguin {
    String name;
    String color;
    double weight;

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public Penguin(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
}
