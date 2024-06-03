package Lab5.Prob5;

public class ApplianceTest {
    public static void main(String[] args) {
        Appliance[] appliances = new Appliance[]
        {
                new WashingMachine(7),
                new Refrigerator(4),
                new Microwave(800)
        };

        for (Appliance app : appliances)
        {
            System.out.println(app.getClass().getSimpleName());
            app.performFunction();
        }
    }
}
