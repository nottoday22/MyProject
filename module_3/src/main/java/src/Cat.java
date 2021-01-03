package src;

public class Cat {
    public static int count = 0;
    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    private double eatenFood;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
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
    //check ssh connect
}