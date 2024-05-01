package models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel {
    private Date exitDate;
    private Ticket token;
    private Gate ExitedAt;
    private List<Payment> payments;
    private int totalAmount;
    private BillStatus billStatus;

    public Date getExitDate() {
        return exitDate;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }

    public Ticket getToken() {
        return token;
    }

    public void setToken(Ticket token) {
        this.token = token;
    }

    public Gate getExitedAt() {
        return ExitedAt;
    }

    public void setExitedAt(Gate exitedAt) {
        ExitedAt = exitedAt;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
