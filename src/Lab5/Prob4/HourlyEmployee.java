package Lab5.Prob4;

public final class HourlyEmployee extends Employee{
    private double wage;
    private double hour;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hour) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double getPayment() {
        return wage * hour;
    }

    @Override
    public String toString()
    {
        return String.format("%s%nWage : %f%nHour : %f%nSalary : %f",super.toString(),wage, hour,this.getPayment());
    }
}
