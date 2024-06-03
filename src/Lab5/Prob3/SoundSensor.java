package Lab5.Prob3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    String location;
    private String lastUpdated;
    double soundLevel;

    private static final String sensorType = "Sound";

    SoundSensor(String location, double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
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
        return String.valueOf(soundLevel);
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public String performAction() {
        return soundLevel > 70 ? "an alert to" : "Sound is within normal range";
    }

    @Override
    public String toString() {
        return "Sensor Type: " + sensorType + "\n" +
                "Reading: " + soundLevel + "\n" +
                "Location: " + location + "\n" +
                "Last Updated: " + lastUpdated + "\n" +
                "Action: " + this.performAction() + "\n";
    }
}
