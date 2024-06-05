package Lab5.Prob6.case2;

public class TestClass {
    public static void main(String[] args) {
        Person p1 = new Person("Myanmar");
        Person p2 = new Person("Myanmar");
        Person p3 = new Person("Cambodia");
        VisaHolder p4 = new VisaHolder("Myanmar","F1");

        System.out.println("All Myanmar citizen are same : " + p1.equals(p2));
        System.out.println("Myanmar and Cambodia citizen are same : " + p1.equals(p3));
        System.out.println("All person from same country are F1 holder : " + p4.equals(p1));
    }
}
