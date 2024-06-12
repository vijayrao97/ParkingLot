package Controller;

import DTO.IssueBillRequest;
import DTO.IssueBillResponse;
import Services.BillService;
import models.Bill;

public class BillController {
    private BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    public IssueBillResponse IssueBill(IssueBillRequest issueBillRequest){
        IssueBillResponse issueBillResponse = new IssueBillResponse();
        try{
            Bill b = billService.issueBill(issueBillRequest.getTicketNumber(),
                    issueBillRequest.getGateNumber());
            issueBillResponse.setBill(b);
            issueBillResponse.setBillNumber(String.valueOf(b.getId()));
        }
        catch(Exception e){
            issueBillResponse.setFailureString("Failed to process your bill.");
        }
        return issueBillResponse;
    }

}