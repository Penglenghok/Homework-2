package lesson9.Prob4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private Queue<Ticket> queue;
    private int nextId;

    public TicketingSystem() {
        queue = new LinkedList<>();
        nextId = 0;
    }

    public void addTicket(String description) {
        Ticket ticket = new Ticket(++nextId, description);
        queue.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }

    public Ticket processTicket(){
        if(queue.isEmpty()){
            return null;
        }
        Ticket ticket = queue.peek();
        queue.remove(ticket);

        return ticket;
    }

    public Ticket viewNextTicket(){
        if(queue.isEmpty()){
            return null;
        }

        return queue.peek();
    }
}
