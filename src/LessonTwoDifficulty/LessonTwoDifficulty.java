package LessonTwoDifficulty;

import java.util.Scanner;

public class LessonTwoDifficulty {
    public static void main(String[] args) {
        int value;
        System.out.print("Введите переменную для сравнения: ");
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();
        if (value > 10) {
            System.out.println("Число больше 10");
        } else {
            System.out.println("Число меньше 10");
        }
        System.out.println("\n");

        boolean statement = true;
        int a;
        int b;
        a = 10;
        b = 5;
        if (statement == (a > b)) {
            System.out.println("a>b");
        }

        a = 50;
        b = 25;
        if (statement == (a > b)) {
            System.out.println("a>b");
        }

        a = 67;
        b = 23;
        if (statement == (a < b)) {
            System.out.println("a<b");
        } else {
            System.out.println("Данное сравнение не верно");
        }

        a = 90;
        b = 80;
        if (statement == (a == b)) {
            System.out.println("a==b");
        } else {
            System.out.println("Давнное сравнение не верно");
        }

        System.out.print("Введите значение a = ");
        Scanner compare = new Scanner(System.in);
        a = compare.nextInt();
        b = 60;
        if (statement == (a == b)) {
            System.out.println("Сравнение верно");
        } else {
            System.out.println("Сравнение не верно");
        }

        a = 100;
        b = compare.nextInt();
        if (statement == (a < b)) {
            System.out.println("Сравнение верно");
        } else if (statement != (a < b)) {
            System.out.println("Не верно");
        }

        b = 60;
        a = compare.nextInt();
        if (statement == (a==b)){
            System.out.println("Сравнение верно: " + ((a+b)/2));
        } else {
            System.out.println("Не верный ввод");
        }

        b = 146;
        a = compare.nextInt();
        if (statement == (a==b)){
            System.out.println("Сравнение верно: " + ((a+b)/2));
        } else {
            System.out.println("Не верный ввод");
        }

    }
}
