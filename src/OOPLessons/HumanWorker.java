package OOPLessons;

import java.util.Scanner;


public class HumanWorker {
    public static void main(String[] args) throws Exception {

        Scanner userInput = new Scanner(System.in);

        Specialist chaptMaster = new Specialist();
        chaptMaster.setNameOfPerson("Pepegor");
        chaptMaster.getWorkingCompany("OOO YOBA");
        System.out.println(chaptMaster.getNameOfPerson());
        System.out.println(Specialist.salaryComparAge(31, 30000));
        Specialist.salaryValidate();
    }

    

    public static int inputCheck(Scanner userInput) {
        while (!userInput.hasNextInt()) {
            System.out.println("It's not an integer, try again");
            userInput.nextInt();
        }
        return userInput.nextInt();
    }

}
