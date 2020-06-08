package lesson6.animals;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
        this.type = "Пёс";
        this.maxRun = random.nextInt(500);
        this.maxSwim = random.nextInt(10) + 1;
    }
}

