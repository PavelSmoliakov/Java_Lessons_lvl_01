package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Мася", (byte) 40),
                new Cat("Блохастый", (byte) 30),
                new Cat("Мурзик", (byte) 20),
                new Cat("Мурчалкин", (byte) 15),
        };

        System.out.println("Ваши коты голодны! Пришло время их покормить.");
        Plate plate = new Plate(100);

        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            cat.info();
        }
        plate.addFood(20);
        plate.info();
    }
}
