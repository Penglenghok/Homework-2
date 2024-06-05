package Lab5.Prob6.case3;

public class VisaHolder {
    private Person person;
    private String visaType;


    public VisaHolder(String citizen,String visaType)
    {
        person = new Person(citizen);
        this.visaType = visaType;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        VisaHolder visaHolder = (VisaHolder)obj;
        return this.person.equals(visaHolder.person) && visaType.equals(visaHolder.visaType);
    }
}
