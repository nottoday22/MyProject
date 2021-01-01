package Booleans.src;

public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Cat vaska = new Cat();
        Cat tima = new Cat();
        System.out.println(vaska.getWeight());
        System.out.println(tima.getWeight());
        System.out.println("Cat is " + cat.getStatus());

//        vaska.feed(3000.42);
//        System.out.println("Vaska is " + vaska.getStatus());
//
//        tima.drink(6900.23);
//        System.out.println("Tima is " + tima.getStatus());

        while (true){
            vaska.meow();
            if(vaska.getWeight() < 1000){
                System.out.println(vaska.getStatus());
                break;
            }
        }
    }
}