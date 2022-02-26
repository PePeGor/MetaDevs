package LessonTheeDifficulty;

import java.util.Scanner;
import java.lang.String;

public class LessonThreeDifficulty {
    public static void main(String[] args) {
        System.out.println("Задача 3.1\n");

        int month;
        System.out.println("Введите номер месяца чтобы опредилить принадлежность к сезону");
        Scanner scan = new Scanner(System.in);
        month = scan.nextInt();
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Это месяц зимы");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Это месяц весны");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Это месяц лета");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Это месяц осени");
        } else {
            System.out.println("Месяц из неизвестного времени года");
        }

        System.out.println("\nЗадача 3.2\n");

        int number, i;
        System.out.print("Enter the number: ");
        number = scan.nextInt();
        System.out.print("Enter the i: ");
        i = scan.nextInt();
         if (number < i) {
             while (number < i) {
                 System.out.println("number is less then i");
             }
         } else
                System.out.println("number is greater the i");
            number++;

        System.out.println("\nЗадача 3.3\n");

        int choiceNumbers = numberFromTheList();
        int resultOfMatch;
        String anotherResult;
        resultOfMatch = ((choiceNumbers == 0 || choiceNumbers == 2) ? choiceNumbers + 7 : choiceNumbers / 10);
        System.out.println(resultOfMatch);
        resultOfMatch = ((choiceNumbers == -3 || choiceNumbers == 5) ? choiceNumbers + 7 : choiceNumbers / 10);
        System.out.println(resultOfMatch);

        anotherResult = (choiceNumbers > 0 && choiceNumbers < 5) ? "Верно" : "Неверно";
        System.out.println(anotherResult);

    }

    public static int numberFromTheList() {
        int[] a = new int[]{5, 0, -3, 2};
        int rnd = (int) Math.floor(Math.random() * a.length);
        return rnd;
    }
}


