package lesson6.animals;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
        this.type = "Кот";
        this.maxRun = random.nextInt(200);
        //this.maxSwim = random.nextInt(1);
    }

    @Override
    public void swim(int dist) {
        System.out.println("Коты не могут плавать");
    }
}

