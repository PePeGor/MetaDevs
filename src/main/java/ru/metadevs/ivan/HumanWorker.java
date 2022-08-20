package ru.metadevs.ivan;

public class HumanWorker {
    public static void main(String[] args) {

        Company metodoMagya = new Company("OOO YOBA", 2);
        Manager ivan = new Manager("Ivan", 31);
        Specialist keka = new Specialist("Keka", 15);

        metodoMagya.hire(ivan, 1500);
//        System.out.println(Arrays.toString(metodoMagya.getEmployees()));
        metodoMagya.hire(keka, 1500);
//        System.out.println(Arrays.toString(metodoMagya.getEmployees()));
        metodoMagya.printEmployees();
    }

}
