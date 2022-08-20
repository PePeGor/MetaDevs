package ru.metadevs.ivan;

public class Manager extends AbstractEmployee {

    public Manager(String nameOfPerson, int ageOfPerson) {
       super(nameOfPerson, ageOfPerson);
    }

    @Override
    public void printPersonalInfo() {
        System.out.println("I'm Manager");
        super.printPersonalInfo();
    }

    @Override
    public String toString(){
        return "Manager" + super.toString();
    }
}
