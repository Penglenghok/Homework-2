package Problem3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Event {
    private String name;
    private LocalDateTime date;

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    private String timeZone;

    private String OUTPUT_DATE_PATTERN = "EEEE, MMMM dd, yyyy kk:mm";

    public Event(String name, LocalDateTime date) {
        this.name = name;
        this.date = date;
    }

    public Event() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(OUTPUT_DATE_PATTERN);

    private String formateDateOutPut() {
        return formatter.format(this.date) + " " + "[" + ZoneId.systemDefault() + "]";
    }

    private String formateDateOutPutWithDifferentTimeZone() {
        ZonedDateTime zonedDateTime = this.date.atZone(ZoneId.systemDefault());
        return formatter.format(zonedDateTime.withZoneSameInstant(ZoneId.of(this.timeZone))) + " " + "[" + this.timeZone + "]";
    }


    private String isLeapYear() {
        return LocalDate.of(this.date.getYear(), this.date.getMonth(), this.date.getDayOfMonth()).isLeapYear() ? "leap year" : "not leap year";
    }

    private String daysUntilEvent() {
        return String.valueOf(ChronoUnit.DAYS.between(LocalDateTime.now().atZone(ZoneId.systemDefault()).toLocalDate(),
                this.date.toLocalDate()));
    }

    public void printEventWithDifZone(){
        String res= "The event will be held on " + this.formateDateOutPutWithDifferentTimeZone();
        System.out.println(res);
    }


    @Override
    public String toString() {
        return " - The event " + name + '\n' +
                " - Will be held on " + this.formateDateOutPut() + '\n' +
                " - And the year is " + this.isLeapYear() + '\n' +
                " - There are " + this.daysUntilEvent() + " days until the event" + '\n'
                ;
    }
}
