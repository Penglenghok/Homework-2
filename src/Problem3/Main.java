package Problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String eventName, date;
        String INPUT_DATE_PATTERN="MM-dd-yyyy kk:mm";
        String answer="No";

        Scanner eventNameScan = new Scanner(System.in);
        Scanner dateScan = new Scanner(System.in);
        Scanner timeScan = new Scanner(System.in);
        Scanner timeZoneScan = new Scanner(System.in);
        Scanner needMoreTimeZoneScan = new Scanner(System.in);


        Event event = new Event();

        System.out.println("Enter Event Name");
        eventName = eventNameScan.nextLine();
        event.setName(eventName);


        System.out.println("Enter Date with format MM-dd-yyyy");
        date = dateScan.nextLine();

        System.out.println("Enter Time with format hh:mm");
        date = date +" "+timeScan.nextLine();
        event.setDate(LocalDateTime.parse(date,DateTimeFormatter.ofPattern(INPUT_DATE_PATTERN)));
        System.out.println(event.toString());


        while (true){
            try{
                System.out.println("Do you wish to view it in other timezone?");
                answer = needMoreTimeZoneScan.nextLine();
                if(answer.equals("YES")){
                    System.out.println("Enter TimeZone");
                    event.setTimeZone(timeZoneScan.nextLine());
                    event.printEventWithDifZone();
                    break;
                }else{
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Error enter time zone again");
                answer = needMoreTimeZoneScan.nextLine();
                if(answer.equals("YES")){
                    System.out.println("Enter TimeZone");
                    event.setTimeZone(timeZoneScan.nextLine());
                    event.printEventWithDifZone();
                    break;
                }else{
                    break;
                }
            }
        }







    }
}
