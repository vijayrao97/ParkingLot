package models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel {
    private Date exitTime;
    private Ticket Token;
    private Gate exitAt;
    private List<Payment> payments;
    private int totalAmount;
    private BillStatus billStatus;

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getToken() {
        return Token;
    }

    public void setToken(Ticket token) {
        Token = token;
    }

    public Gate getExitAt() {
        return exitAt;
    }

    public void setExitAt(Gate exitAt) {
        this.exitAt = exitAt;
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
