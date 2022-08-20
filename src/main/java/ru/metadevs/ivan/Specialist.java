package ru.metadevs.ivan;

public class Specialist extends AbstractEmployee {

    public Specialist(String nameOfPerson, int ageOfPerson) {
       super(nameOfPerson, ageOfPerson);
    }

    @Override
    public void printPersonalInfo() {
        System.out.println("I'm Specialist");
        super.printPersonalInfo();
    }

    @Override
    public String toString(){
        return "Specialist" + super.toString();
    }
}