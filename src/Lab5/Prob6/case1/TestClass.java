package Lab5.Prob6.case1;

public class TestClass {
    public static void main(String[] args) {

        Person p1 = new Person("USA");
        Person p2 = new Person("USA");
        Person p3 = new Person("Myanmar");
        Citizen p4 = new Citizen("USA","Male");

        System.out.println("USA citizen are same : " + p1.equals(p2));
        System.out.println("Myanmar and USA citizen are same : " + p1.equals(p3));
        System.out.println("Any USA citizen are same regardless of gender : " + p4.equals(p1));
    }
}
