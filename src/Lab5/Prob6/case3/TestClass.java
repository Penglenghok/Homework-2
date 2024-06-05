package Lab5.Prob6.case3;

public class TestClass {
    public static void main(String[] args) {
        VisaHolder p1 = new VisaHolder("Myanmar","F1");
        VisaHolder p2 = new VisaHolder("Myanmar","F1");
        VisaHolder p3 = new VisaHolder("Cambodia","F1");

        System.out.println("F1 visa holder from same country are same citizen : " + p1.equals(p2));
        System.out.println("F1 visa holder from different country are same citizen : " + p1.equals(p3));
    }
}
