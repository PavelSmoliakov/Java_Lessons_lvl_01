package lesson7;

public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        int x = food - amount;
        if (x < 0) {
            return false;
        } else {
            food -= amount;
            return true;
        }
    }

    public void info() {
        System.out.printf("\nТарелка наполнена едой в количестве %d подушечек корма.", food);
    }

    public void addFood(int add) {
        System.out.printf("\nДобавляем в тарелку %d подушечек.", add);
        food += add;
    }
}
