package lesson4;

import java.util.Random;
import java.util.Scanner;

public class XOGame {

    public static final int SIZE_X = 5;
    public static final int SIZE_Y = 5;
    public static final char HUMAN_DOT = 'X';
    public static final char COMP_DOT = 'O';
    public static final char EMPTY_DOT = '.';
    public static final int DOTS_TO_WIN = 4;

    public static char [][] map = new char[SIZE_Y][SIZE_X];

    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void showMap () {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
            map[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printMap () {
        System.out.print("  ");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void setSum (int y, int x, char sum){
        map[y][x] = sum;
    }


    public static void humanTurn (){
        int x, y;
        do {
            System.out.println("Введите координаты Вашего хода X (принимаются значения от 1 до " + SIZE_X + ") и Y (принимаются значения от 1 до " + SIZE_Y + ")");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y,x));
        setSum(y, x, HUMAN_DOT);
    }

    public static void compTurn () {
        int x, y;
        do {
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while (!isCellValid(y,x));
        setSum(y, x, COMP_DOT);
    }


    public static boolean isCellValid (int y, int x){
        if (x < 0 || y < 0 || x > SIZE_X || y > SIZE_Y){
            return false;
        }
        return map[y][x] == EMPTY_DOT;
    }

    public static boolean isFull (){
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (map[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean checkWhoWin (char sum){
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (lineCheck(i, j, 0, 1, sum)){
                    return true;
                }
                if (lineCheck(i, j, 1, 1, sum)){
                    return true;
                }
                if (lineCheck(i, j, 1, 0, sum)){
                    return true;
                }
                if (lineCheck(i, j, -1, 1, sum)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean lineCheck(int y, int x, int vy, int vx, char sum) {
        int wayOnX = x + (DOTS_TO_WIN - 1) * vx;
        int wayOnY = y + (DOTS_TO_WIN - 1) * vy;
        if(wayOnX < 0 || wayOnY < 0 || wayOnX > SIZE_X - 1 || wayOnY > SIZE_Y - 1){
            return false;
        }
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if(map[itemY][itemX] != sum) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        showMap();
        printMap();

        while (true){
            humanTurn();
            printMap();
            if(checkWhoWin(HUMAN_DOT)) {
                System.out.println("Вы победили");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            compTurn();
            printMap();
            if(checkWhoWin(COMP_DOT)) {
                System.out.println("Компьютер победил");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }
}
