package Lab5.Prob4;

public class Main {
    public static void main(String[] args) {
        BasePlusCommisionEmployee be = new BasePlusCommisionEmployee("Base+Comm First Name","Base+Comm Last Name","Base+Comm SSN",1.0,12.5);
        be.setBaseSalary(100.5);

        CommissionEmployee ce = new CommissionEmployee("Comm First Name","Comm Last Name","Comm SSN", 2.5,5.7);

        HourlyEmployee he = new HourlyEmployee("Hour First Name","Hour Last Name","Hour SSN", 13.5,8);

        SalariedEmployee se = new SalariedEmployee("Salary First Name","Salary Last Name","Salary SSN",2600);

        Employee[] employees = new Employee[4];
        employees[0] = be;
        employees[1] = ce;
        employees[2] = he;
        employees[3] = se;

        System.out.println("Person who got the maximum salary");
        System.out.println(findMaxSalary(employees).toString());
    }

    public static Employee findMaxSalary (Employee[] employees)
    {
        double maxSalary = 0;
        Employee employee = null;
        for(Employee e : employees)
        {
            if (e != null)
            {
                double salary = e.getPayment();
                if(maxSalary < salary)
                {
                    maxSalary = salary;
                    employee = e;
                };
            }
        }

        return employee;
    }
}
