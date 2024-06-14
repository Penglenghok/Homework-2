package lesson9.Prob4;

public class Test {
    public static void main(String[] args) {
        TicketingSystem system = new TicketingSystem();
        system.addTicket("VIP");
        system.addTicket("SAMSUNG");
        system.addTicket("APPLE");

        system.processTicket();
        system.processTicket();

        system.viewNextTicket();
    }
}
