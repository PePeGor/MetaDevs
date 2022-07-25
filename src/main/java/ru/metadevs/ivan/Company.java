package ru.metadevs.ivan;

import java.util.Arrays;

public class Company implements IdealCompany {
    private Employee[] employees;
    private String companyName;

    public Company(String companyName, int amount) {
        this.companyName = companyName;
        this.employees = new Employee[amount];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public void printEmployees() {
        for (Employee employee : employees) {
            employee.printPersonalInfo();
            System.out.println();
        }
    }

    @Override
    public void fire(Employee employee) {
        if (!existsByName(employee.getName())) {
            throw new EmployeeNotFoundException("There is no such employee in the company");
        }
        Employee[] newArray = new Employee[employees.length - 1];
        int newEmployeesIndex = 0;
        for (Employee value : employees) {
            if (!value.equals(employee)) {
                newArray[newEmployeesIndex] = value;
                newEmployeesIndex++;
            }
        }
        employees = newArray;
    }

    @Override
    public void hire(Employee employee, int salary) {
        if (isEmployeeBelongsToCompany(employee)) {
            throw new EmployeeAlreadyExistsInCompanyException("This person is already in staff!");
        }

        employee.salaryValidate(salary);
        employee.setSalary(salary);
        employee.setCompanyName(this.companyName);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }


        employees = Arrays.copyOf(employees, employees.length + 1);
        employees[employees.length - 1] = employee;
    }

    @Override
    public Employee employeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException("There is no such employee in the company");
    }

    private boolean existsByName(String name) {
        try {
            employeeByName(name);
            return true;
        } catch (EmployeeNotFoundException e) {
            return false;
        }
    }// Метод не сильно красивый, но немного иллюстрирует как работать с try\catch

    private boolean isEmployeeBelongsToCompany(Employee employee) {
        return Arrays.asList(employees).contains(employee);
    }
}

