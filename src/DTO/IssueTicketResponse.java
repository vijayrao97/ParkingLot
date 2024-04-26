package DTO;

import models.BaseModel;
import models.Slot;
import models.Vehicle;

import java.util.Date;

public class IssueTicketResponse {
    private String ticketNumber;
    private Date entryTime;
    private Slot slot;
    private Vehicle vehicle;
}
