package DTO;

import models.Bill;
import models.BillStatus;

public class IssueBillResponse {
    private String billNumber;
    private Bill bill;
    private String failureString;

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getFailureString() {
        return failureString;
    }

    public void setFailureString(String failureString) {
        this.failureString = failureString;
    }
}
