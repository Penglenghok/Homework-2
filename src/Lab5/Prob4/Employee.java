package Lab5.Prob4;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    public Employee(){}

    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public abstract double getPayment();

    @Override
    public String toString()
    {
        return String.format("First Name : %s%nLast Name : %s%nSocial Security Number : %s",this.firstName,this.lastName,this.socialSecurityNumber);
    }
}
