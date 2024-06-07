package repo;

import models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepo {
    int previousId = -1;
    private Map<Integer, Ticket> ticketMap = new HashMap<>();
    public Ticket saveTicket(Ticket t){
        int newNumber = previousId+1;
        t.setId(newNumber);
        t.setNumber(newNumber+"");
        ticketMap.put(newNumber,t);
        previousId+=1;
        return t;
    }



}
