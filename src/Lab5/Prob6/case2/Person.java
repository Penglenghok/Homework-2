package Lab5.Prob6.case2;

public class Person {
    private String citizen;
    public Person(String citizen) {
        this.citizen = citizen;
    }

    public String getCitizen() {
        return citizen;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Person person = (Person)obj;
        return this.citizen.equals(person.citizen);
    }
}
