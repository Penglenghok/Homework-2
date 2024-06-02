package Lab5.Prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeptEmployee p1 = new Professor("Prof A",10000.5, LocalDate.of(2020,1,1));
        DeptEmployee p2 = new Professor("Prof B",15000.0, LocalDate.of(2021,2,10));
        DeptEmployee p3 = new Professor("Prof C",18050.0, LocalDate.of(2021,8,15));

        Secretary s1 = new Secretary("SA",5000.0,LocalDate.of(2020,3,1));
        s1.setOvertimeHours(5.2);
        Secretary s2 = new Secretary("SC",7200.0, LocalDate.of(2021,12,20));
        s2.setOvertimeHours(0.8);


        DeptEmployee[] employees = new DeptEmployee[5];
        employees[0]=p1;
        employees[1]=p2;
        employees[2]=p3;
        employees[3]=s1;
        employees[4]=s2;

        Scanner scanner = new Scanner(System.in);
        boolean validInputYN = false;
        while (!validInputYN)
        {
            System.out.println("Do you want to see the sum of all Professor and Secretary salary? Y or N");
            String yesOrNo = scanner.next();

            if(yesOrNo.equals("Y") || yesOrNo.equals("N"))
            {
                validInputYN = true;

                if(yesOrNo.equals("Y"))
                {
                    double sum = 0.0;
                    for(DeptEmployee e : employees)
                    {
                        sum += e.computeSalary();
                    }
                    System.out.printf("The sum of all Professor and Secretary salary : %f%n", sum);

                    System.out.printf("The average salary of the department : %f", sum/ employees.length);
                }
            }
            else
            {
                System.out.println("Invalid input!");
            }
        }

    }
}
