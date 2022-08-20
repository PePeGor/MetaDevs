package ru.metadevs.ivan;

public class EmployeeAlreadyExistsInCompanyException extends IllegalArgumentException {
    public EmployeeAlreadyExistsInCompanyException(String message){
        super(message);
    }
}
