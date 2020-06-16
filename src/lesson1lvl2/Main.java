package lesson1lvl2;

import lesson1lvl2.competitors.Cat;
import lesson1lvl2.competitors.Competitors;
import lesson1lvl2.competitors.Human;
import lesson1lvl2.competitors.Robot;

public class Main {
    public static void main(String[] args) {
        Competitors[] competitors = {
            new Human("Иван"),
            new Cat("Мурзик"),
            new Robot("R2D2-H1n1"),
        };

        Obstacle[] obstacles = {
                new RunningTrack(1000),
                new Wall(2),
        };

        for (Competitors c:competitors) {
            for (Obstacle o:obstacles) {
                o.doIt(c);
                if(!c.isOnDistance()) {
                    break;
                }
            }
            System.out.println();
        }
        for (Competitors competitor : competitors) {
            competitor.info();
        }
    }
}
