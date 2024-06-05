package Lab5.Prob6.case2;

public class VisaHolder extends Person{
    private String visaType;

    public VisaHolder(String citizen,String visaType)
    {
        super(citizen);
        this.visaType = visaType;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        VisaHolder person = (VisaHolder)obj;
        return getCitizen().equals(person.getCitizen()) && visaType.equals(person.visaType);
    }
}
