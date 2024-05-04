package Controller;

import DTO.IssueTicketRequest;
import DTO.IssueTicketResponse;
import Services.TokenService;
import models.Ticket;

public class TicketController {
    private TokenService tokenService;

    public TicketController(TokenService tokenService){
        this.tokenService = new TokenService();
    }

    public IssueTicketResponse IssueTicket(IssueTicketRequest request){
        IssueTicketResponse response = new IssueTicketResponse();
        try{
            Ticket t = new Ticket();
        }
        catch(Exception e){

        }
        return null;
    }

}
