package ModuleGGN;

import java.util.Scanner;

public class GameGuessNumber {
    public static void main(String[] args) {

        int rangeOfRandom = 100;
        int numbOfAttempts = 10;
        int mathRandomNumber = mathRandom();

        System.out.println("Я загадал случайное число от 1 до " + rangeOfRandom);

        for (int i = 1; i <= numbOfAttempts; i++) {
            System.out.println("Попытка №" + i);
            int userInput = new Scanner(System.in).nextInt();
            if (userInput < mathRandomNumber) {
                System.out.println("Введенное число меньше загаданого");
            } else if (userInput > mathRandomNumber) {
                System.out.println("Введённое число больше загаданного");
            } else {
                System.out.println("Вы угадали");
            }
        }
    }

    public static int mathRandom() {
        int rangeOfRandom = 100;
        int mathRnd = (int) (Math.random() * (rangeOfRandom + 1));
        return mathRnd;
    }
}