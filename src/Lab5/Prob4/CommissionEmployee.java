package Lab5.Prob4;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public CommissionEmployee(){}

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString()
    {
        return String.format("%s%nSalary : %f",this.toStringWithoutSalary(), this.getPayment());
    }

    protected String toStringWithoutSalary()
    {
        return String.format("%s%nGrossSales : %f%nCommission Rate : %f",super.toString(),grossSales, commissionRate);
    }
}
