import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        guessNumber();
    }

    public static Random random = new Random();

    public static Scanner sc = new Scanner(System.in);

    public static void guessNumber() {
        do {
            int compRandomNumber = random.nextInt(10);
            System.out.println("Угадайте загаданное число от 0 до 9. Вам даётся 3 попытки.");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введите свой ответ строчкой ниже:");
                int userNumber = sc.nextInt();
                if (userNumber == compRandomNumber) {
                    System.out.println("Вы угадали число, молодец!");
                    break;
                } else {
                    System.out.println(userNumber > compRandomNumber ? "Введенное Вами число больше" : "Введенное Вами число меньше");
//Ввел тернарный оператор, чтобы код занял меньше места, но не смог додумать, как правильно просклонять слово "попыток",
//оставаясь в нём же, а не выходить на (i - 1) > 1, а только потом (i - 1) > 0
                    System.out.println((i - 1) > 0 ? "У вас осталось " + (i - 1) + " попыток" : "К сожалению, попытки закончились, Вы проиграли.");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        }
        while (sc.nextInt() == 1);
    }
}
