package lesson1lvl2;

import lesson1lvl2.competitors.Competitors;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitors c){
        c.jump(height);
    }
}
