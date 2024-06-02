package Lab5.Prob2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    private double overtimeHours;

    public Secretary(String name, double salary, LocalDate hireDate)
    {
        super(name, salary, hireDate);
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double computeSalary()
    {
        return super.salary + (12 * overtimeHours);
    }
}
