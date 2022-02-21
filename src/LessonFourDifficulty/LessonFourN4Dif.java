package LessonFourDifficulty;

import java.util.Scanner;

public class LessonFourN4Dif {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[][] massArray;
        System.out.println("Enter the massRows: ");
        int massRows = userInput.nextInt();
        System.out.println("Enter the massColumns: ");
        int massColumns = userInput.nextInt();
        massArray = new int[massRows][massColumns];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < massRows; i++) {
            for (int j = 0; j < massColumns; j++) {
                massArray[i][j] = userInput.nextInt();
            }
        }
        System.out.println("Present my array: ");
        for (int a = 0; a < massRows; a++) {
            for (int k = 0; k < massColumns; k++) {
                System.out.print(massArray[a][k] + " ");
            }
        }
        reversArray(massArray);
    }



    public static void reversArray(int[][] massArray) {
        int massRows = massArray.length;
        int massColumns = massArray.length;
        int[][] array = new int[massRows][massColumns];
        for (int i = massRows - 1; i >= massRows; i--) {
            for (int j = massColumns - 1; j >= massColumns; j--) {
                massArray[massRows - 1 - i][massColumns - 1 - j] = massArray[i][j];
            }
        }
        for (int j = 0; j < massRows; j++) {
            for (int k = 0; k < massColumns; k++) {
                System.out.print(array[j][k] + " ");
            }
        }
    }
}
