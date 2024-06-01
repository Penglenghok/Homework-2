package Problem2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public HeartRates(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private LocalDate getDob() {
        return dob;
    }

    private void setDob(LocalDate dob) {
        this.dob = dob;
    }

    //a. A method that calculates and returns the person’s age (in years)
    private int getAge(){
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }

    //b. A method that calculates and returns the person’s maximum heart rate.
    private int calMaxHeartRate(){
        return 220-this.getAge();
    }

    //c. A method that calculates and prints the person’s target heart rate range.
    public void calTargetHeartRange(){
        final double RHR = 70, LB = 0.5, UB = 0.85;
        double AHR = calMaxHeartRate() - RHR;
        double LBTHR = (AHR * LB) + RHR;
        double UBTHR = (AHR * UB) + RHR;

        System.out.printf("Target Heart Rate Range is between %s and %s%n", LBTHR, UBTHR);
    }

    @Override
    public String toString() {
        return "First Name: %s\nLast Name: %s\nAge: %d\nDate of Birth: %s\nMaximum Heart Rate: %d".formatted(getFirstName(), getLastName(), getAge(), getDob(), calMaxHeartRate());
    }
}
