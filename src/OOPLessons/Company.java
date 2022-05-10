package OOPLessons;

public class Company {
    private Specialist[] specialists;
    private String name;

    public Company(String name, int amount) {
        this.name = name;
        this.specialists = new Specialist[amount];
    }

    public Specialist[] getSpecialists() {
        return specialists;
    }

    public void hire(Specialist specialist) {
        for (int i = 0; i < specialists.length; i++) {
            if (specialists[i] == null) {
                specialists[i] = specialist;
                return;
            }
            if (specialists.length > 0  && specialists[i] != null) {
                return;
            }
        }
    }

    public void fire(Specialist specialist) {
        Specialist[] newArray = new Specialist[specialists.length - 1];
        for (int i = 0, j = 0; i < specialists.length; i++) {
            if (specialists[i] != specialist) {
                newArray[j++] = specialists[i];
            }
        }
        specialists = newArray;
    }

    public void printCompany() {
        for (int i = 0; i < specialists.length; i++) {
            System.out.print(specialists[i].getNameOfPerson());
            System.out.print(" " + specialists[i].getAgeOfPerson() + " ");
            System.out.printf("%d", specialists[i].getSalary());
            System.out.println();
        }
    }
}