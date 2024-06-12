package Services;

import models.Bill;
import models.BillStatus;
import models.Gate;
import models.Ticket;
import repo.*;

import java.util.Optional;

public class BillService {
    private GateRepo gateRepo;
    private ParkingLotRepo parkingLotRepo;
    private SlotRepo slotRepo;
    private TicketRepo ticketRepo;
    private VehicleRepo vehicleRepo;

    public BillService(GateRepo gateRepo, ParkingLotRepo parkingLotRepo,
                       SlotRepo slotRepo, TicketRepo ticketRepo,
                       VehicleRepo vehicleRepo) {
        this.gateRepo = gateRepo;
        this.parkingLotRepo = parkingLotRepo;
        this.slotRepo = slotRepo;
        this.ticketRepo = ticketRepo;
        this.vehicleRepo = vehicleRepo;
    }

    public Bill issueBill(int ticketNo, int gateId){
        Bill b1 = new Bill();
        Optional<Ticket> billOptional = ticketRepo.findById(ticketNo);
        if( billOptional.isEmpty() ){
            throw new RuntimeException("Ticket not found");
        }
        b1.setToken(billOptional.get());
        Optional<Gate> exitOptional = gateRepo.findGateById(gateId);
        if( exitOptional.isEmpty() ){
            throw new RuntimeException("Gate not found");
        }
        b1.setExitedAt(exitOptional.get());
        b1.setBillStatus(BillStatus.PENDING);
        b1.setTotalAmount(100);
        return b1;
    }
}
