package lesson6.animals;

import java.util.Random;

public class Animal {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    public Random random = new Random();


    public Animal(String name){
        this.name = name;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) {
            System.out.println(this.type + " " + this.name + " пробежал " + dist + " м");
        } else {
            System.out.println(this.type + " " + this.name + " не может пробежать так далеко");
        }
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist){
            System.out.println(this.type + " " + this.name + " проплыл" + dist + " м");
        } else {
            System.out.println(this.type + " " + this.name + " не может заплыть так далеко");
        }
    }

    public void info() {
        System.out.println(this.type + " " + this.name + " пробежал: " + this.maxRun + " м., проплыл: " + this.maxSwim + " м.");
    }
}

