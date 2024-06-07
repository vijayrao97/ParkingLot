package Controller;

import DTO.IssueTicketRequest;
import DTO.IssueTicketResponse;
import Services.TokenService;
import models.Ticket;

public class TicketController {
    private TokenService tokenService;

    public TicketController(TokenService tokenService){
        this.tokenService = tokenService;
    }

    public IssueTicketResponse IssueTicket(IssueTicketRequest request){
        IssueTicketResponse response = new IssueTicketResponse();
        try{
            Ticket t = tokenService.IssueTicket(request.getVehicleNo(),request.getOwnerName(),
                    request.getGateId(), request.getVehicleType());
            response.setSlot(t.getSlot());
            response.setStatusCode("Success");
            response.setEntryTime(t.getEntryTime());
            response.setVehicle(t.getVehicle());
            response.setTicketNumber(t.getNumber());
        }
        catch(Exception e){
            response.setStatusCode("Failure");
            response.setFailureString(e.toString());
        }
        return response;
    }

}
