package Lab5.Prob2;

import java.time.LocalDate;

public class DeptEmployee {
    protected String name;
    protected double salary;
    protected LocalDate hireDate;

    public DeptEmployee(String name, double salary, LocalDate hireDate)
    {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public double computeSalary()
    {
        return salary;
    }
}
