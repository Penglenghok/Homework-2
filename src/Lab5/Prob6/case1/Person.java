package Lab5.Prob6.case1;

public class Person {
    private String citizen;
    public Person(String citizen) {
        this.citizen = citizen;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null) return false;
        if(!(obj instanceof Person)) return false;
        Person person = (Person)obj;
        return this.citizen.equals(person.citizen);
    }
}
