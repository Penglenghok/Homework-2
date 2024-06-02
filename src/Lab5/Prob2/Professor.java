package Lab5.Prob2;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
    private int numberOfPublications;

    public Professor(String name, double salary, LocalDate hireDate)
    {
        super(name, salary, hireDate);
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
