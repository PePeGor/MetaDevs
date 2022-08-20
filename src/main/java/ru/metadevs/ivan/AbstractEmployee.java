package ru.metadevs.ivan;

public abstract class AbstractEmployee implements Employee {

    private String nameOfPerson;
    private int ageOfPerson;
    private int salary;
    private String companyName;

    protected AbstractEmployee(String nameOfPerson, int ageOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;
    }

    public String getName() {
        return nameOfPerson;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void salaryValidate(int salary) {
        if (salary < ageOfPerson) {
            throw new SalaryValidateException("Salary could not be lower than ageOfPerson");
        }
    }

    @Override
    public void printPersonalInfo (){
        System.out.println();
        System.out.print(this.nameOfPerson);
        System.out.print(" " + this.ageOfPerson + " ");
        System.out.printf("%d", this.salary);
        System.out.println(" " + this.companyName);
    }

    @Override
    public String toString() {
        return " " +
                "nameOfPerson='" + nameOfPerson + '\'' +
                ", ageOfPerson=" + ageOfPerson +
                ", salary=" + salary +
                ", companyName= " + companyName +
                '}';
    }
}
