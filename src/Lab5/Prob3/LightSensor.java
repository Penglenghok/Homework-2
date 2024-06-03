package Lab5.Prob3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    String location;
    private String lastUpdated ;
    double lightLevel;
    private static final String sensorType = "Light";

    LightSensor(String location, double lightLevel) {
//        lastUpdated = Sensor.getLastUpdated();
        this.location = location;
        this.lightLevel = lightLevel;
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
        return String.valueOf(this.lightLevel);
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public String performAction() {
        return lightLevel > 100 ? "“an alert to turn on" : "Light is sufficient";
    }

    @Override
    public String toString() {
        return "Sensor Type: " + sensorType + "\n" +
                "Reading: " + lightLevel + "\n" +
                "Location: " + location + "\n" +
                "Last Updated: " + lastUpdated + "\n" +
                "Action: " + this.performAction() + "\n";
    }
}
