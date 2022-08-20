package ru.metadevs.ivan;

public interface IdealCompany {

    void fire(AbstractEmployee specialist);

    void hire(AbstractEmployee specialist, int salary);

    void printEmployees();

    AbstractEmployee employeeByName(String name);

}
