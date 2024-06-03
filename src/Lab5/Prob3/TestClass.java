package Lab5.Prob3;

public class TestClass {

    public static void main(String[] args) {

        Sensor[] sensors = {
                new TemparatureSensor("Living Room", 23.5),
                new LightSensor("Garden", 80.0),
                new SoundSensor("Bedroom", 65.0)
        };

        for (Sensor s:sensors){
            s.getLastUpdated();
            System.out.println(s.toString());
        }

    }

}
