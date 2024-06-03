package Lab5.Prob3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemparatureSensor implements Sensor {

    String location;
    private String lastUpdated;
    double temperature;

    private static final String sensorType = "Temperature";
    String Location;

    TemparatureSensor(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    @Override
    public String getLastUpdated() {
        lastUpdated = DateTimeFormatter.ofPattern("hh:mm a").format(LocalDateTime.now());
        return lastUpdated;
    }
    @Override
    public String getSensorType() {
        return this.sensorType;
    }

    @Override
    public String getReading() {
        return String.valueOf(temperature);
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public String performAction() {
        return temperature > 30 ? "an alert to\n" +
                "turn on the AC" : temperature < 18 ? "“an alert to turn on the Heater" : "Temperature is in normal range";
    }

    @Override
    public String toString() {
        return "Sensor Type: " + sensorType + "\n" +
                "Reading: " + temperature + "\n" +
                "Location: " + location + "\n" +
                "Last Updated: " + lastUpdated + "\n" +
                "Action: " + this.performAction() + "\n";
    }
}
