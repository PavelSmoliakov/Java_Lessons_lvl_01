package lesson1lvl2.competitors;

public class Cat implements Competitors {

    String name;

    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Cat(String name) {
        this(name,100,3);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.printf("%s успешно пробежал %d метров\n",  name, dist);
        } else {
            System.out.printf("%s не смог пробежать %d метров\n", name, dist);
            System.out.printf("%s выбывает с дистанции\n", name);
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.printf("%s успешно прыгнул %d метров\n", name, height);
        } else {
            System.out.printf("%s не смог прыгнуть %d метров\n", name, height);
            System.out.printf("%s выбывает с дистанции\n", name);
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %b\n", name, onDistance);
    }

}
