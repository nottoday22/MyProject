package src;

public class Cat {
    public static final int NUMBER_OF_EYES = 2;
    public static final double MIN_WEIGHT = 1000.00;
    public static final double MAX_WEIGHT = 9000.00;


    public static int count = 0;
    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    private double eatenFood;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Cat(double weight, double maxWeight, double minWeight){
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public Cat(Cat other){
        this(other.getWeight(), other.getMaxWeight(), other.getMinWeight());
    }

    public Cat(double weight) {
        this.weight = weight;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void pee() {
        weight = weight - 10;
        System.out.println("Pee on sofa");
    }

    public void feed(Double amount) {
        eatenFood = amount + eatenFood;
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getSumOfFood() {
        return eatenFood;
    }

    public static int getCount() {
        return count;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}