package ru.metadevs.ivan;

public interface Employee {

    void printPersonalInfo();
    void salaryValidate(int salary);

    default void needCoffee() {
        System.out.println("I need a cup of Coffee");
    }
}
