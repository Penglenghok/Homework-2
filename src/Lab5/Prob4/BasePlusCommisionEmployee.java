package Lab5.Prob4;

public final class BasePlusCommisionEmployee extends CommissionEmployee{
    private double baseSalary;

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
    {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }

    @Override
    public String toString()
    {
        return String.format("%s%nBase Salary : %f%nSalary : %f",super.toStringWithoutSalary(),this.baseSalary,this.getPayment());
    }

    @Override
    public double getPayment() {
        return baseSalary + super.getPayment();
    }
}
