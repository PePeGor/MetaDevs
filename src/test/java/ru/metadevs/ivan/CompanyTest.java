package ru.metadevs.ivan;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CompanyTest {

    @Test
    public void shouldHireEmployeesToCompany() {
        Company metaDevs = new Company("Metadevs", 2);
        Manager ivan = new Manager("Ivan", 21);
        Specialist pavel = new Specialist("Pavel", 18);

        metaDevs.hire(ivan, 1500);
        metaDevs.hire(pavel, 1200);

        assertThat(metaDevs.getEmployees().length).isEqualTo(2);
        assertThat(metaDevs.employeeByName(ivan.getName())).isEqualTo(ivan);
        assertThat(metaDevs.employeeByName(pavel.getName())).isEqualTo(pavel);
    }

    @Test
    public void shouldThrowHireEmployeeAlreadyExistsInCompanyExceptionWhenTryHireEmployeeToCompany(){
        Company metaDevs = new Company("Metadevs", 1);
        Manager ivan = new Manager("Ivan", 21);
        metaDevs.hire(ivan, 1500);

        assertThatExceptionOfType(EmployeeAlreadyExistsInCompanyException.class).isThrownBy(() ->  metaDevs.hire(ivan, 1500));
    }

    @Test
    public void shouldThrowHireSalaryValidateExceptionWhenTryHireEmployeeToCompany(){
        Company metaDevs = new Company("Metadevs", 1);
        Manager ivan = new Manager("Ivan", 21);

        assertThatExceptionOfType(SalaryValidateException.class).isThrownBy(() ->  metaDevs.hire(ivan, 20));
    }

    @Test
    public void shouldFireEmployeeFromCompany (){
        Company metaDevs = new Company("Metadevs", 2);
        Specialist ivan = new Specialist("Ivan", 21);
        Specialist misha = new Specialist("Misha", 25);


        metaDevs.hire(ivan,1500);
        metaDevs.hire(misha,1200);

        metaDevs.fire(ivan);

        assertThat(metaDevs.getEmployees().length).isEqualTo(1);
        assertThatExceptionOfType(EmployeeNotFoundException.class).isThrownBy(() ->  metaDevs.employeeByName(ivan.getName()));
    }

    @Test
    public void shouldThrowEmployeeNotFoundExceptionWhenTryToFireEmployeeFromCompany() {
        Company metaDevs = new Company("Metadevs", 1);
        Manager ivan = new Manager("Ivan", 21);
        Specialist pavel = new Specialist("Pavel", 18);

        metaDevs.hire(ivan, 1500);

        assertThatExceptionOfType(EmployeeNotFoundException.class).isThrownBy(() -> metaDevs.fire(pavel));
    }

}

