package Lab5.Prob6.case1;

public class TestClass {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Car",5);
        Car c= new Car("Car",5,"Ford");
        System.out.println(v.equals(c));
    }

}
