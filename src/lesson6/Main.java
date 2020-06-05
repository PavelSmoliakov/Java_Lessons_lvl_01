package lesson6;

import lesson6.animals.Animal;
import lesson6.animals.Cat;
import lesson6.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мася");
        Cat cat2 = new Cat("Мурчалкин");

        Dog dog1 = new Dog("Полкан");
        Dog dog2 = new Dog("Мухтар");

        cat1.info() ;
        cat2.info();

        System.out.println();

        dog1.info();
        dog2.info();
    }
}
