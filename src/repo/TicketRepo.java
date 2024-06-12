package repo;

import models.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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

    public Optional<Ticket> findById(int id){
        if( ticketMap.containsKey(id) ){
            return Optional.of(ticketMap.get(id));
        }
        return Optional.empty();
    }

}
