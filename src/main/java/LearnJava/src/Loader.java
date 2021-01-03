package LearnJava.src;

import java.io.IOException;

public class Loader
{
    public static void main(String[] args) throws IOException {
        Cat vaska = new Cat();
        Cat murka = new Cat();
        Cat kot = new Cat();
        Cat dron = new Cat();
        Cat hrom = new Cat();

        System.out.println("Вес Васьки: " + vaska.getWeight());
        System.out.println("Вес Мурки: " +murka.getWeight());
        System.out.println("Вес Кота: " +kot.getWeight());
        System.out.println("Вес Дрона: " +dron.getWeight());
        System.out.println("Вес Хрома: " +hrom.getWeight());

        vaska.feed(50550.53);
        kot.feed(53.32);
        System.out.println("Теперь вес Васьки стал: " + vaska.getWeight());
        System.out.println("Теперь вес Кота стал: " + kot.getWeight());
        System.out.println("Васька должен взорваться: " + vaska.getStatus());

        while (true) {
            kot.meow();
            if(kot.getWeight() < 1000) {
                System.out.println("Кот замяукан до смерти? : " + kot.getStatus());
                break;
            }
        }

        hrom.feed(150.00);
        hrom.feed(150.00);
        hrom.pee();
        hrom.pee();
        System.out.println("Сколько хром съел грамм всего? : " + hrom.getSumOfFood());

        System.out.println("Сколько котиков всего: " + Cat.getCount());
    }
}