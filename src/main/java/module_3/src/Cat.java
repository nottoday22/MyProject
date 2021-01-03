package module_3.src;

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
        boolean wasAlive = isAlive();
        weight = weight - 1;
        System.out.println("Meow");
        if (wasAlive && !isAlive()) {
            count--;
        }
    }

    public void pee() {
        boolean wasAlive = isAlive();
        weight = weight - 10;
        System.out.println("Pee on sofa");
        if (wasAlive && !isAlive()) {
            count--;
        }
    }

    public void feed(Double amount) {
        boolean wasAlive = isAlive();
        eatenFood = amount + eatenFood;
        weight = weight + amount;
        if (wasAlive && !isAlive()) {
            count--;
        }
    }

    public void drink(Double amount) {
        boolean wasAlive = isAlive();
        weight = weight + amount;
        if (wasAlive && !isAlive()) {
            count--;
        }
    }

    public Double getSumOfFood(){
        return eatenFood;
    }

    public static int getCount(){
        return count;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
    private boolean isAlive() {
        if(!(getStatus().equals("Dead") || getStatus().equals("Exploded"))){
            return true;
        }
        else{
            return false;
        }
    }
}