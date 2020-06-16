package lesson1lvl2;

import lesson1lvl2.competitors.Competitors;

public class RunningTrack extends Obstacle {
    private int dist;

    public RunningTrack(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitors c) {
        c.run(dist);
    }
}
