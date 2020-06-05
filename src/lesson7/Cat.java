package lesson7;

public class Cat {
    private String name;
    private byte appetite;
    private boolean satiety;

    public Cat(String name, byte appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void info() {
        System.out.printf("\nКот %s серьезно настроен съесть %d подушечек корма и подходит к общей миске.\n", getName(), getAppetite());
        System.out.printf("Кот %s %s", getName(), isSatiety() ? "наелся и доволен жизнью.\n" : "не может есть из тарелки, где мало еды, и всем своим видом просит Вас досыпать корма\n");
    }

    public void eat(Plate plate) {
        if (!isSatiety() && plate.decreaseFood(getAppetite())) {
            satiety = true;
        }
    }
}
