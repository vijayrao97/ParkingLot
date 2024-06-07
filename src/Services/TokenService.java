package Services;

import models.*;
import repo.*;
import strategy.SlotAssignmentStratergy;
import strategy.getSlotFactory;

import java.util.Date;
import java.util.Optional;

public class TokenService {
    private GateRepo gateRepo;
    private ParkingLotRepo parkingLotRepo;
    private SlotRepo slotRepo;
    private TicketRepo ticketRepo;
    private VehicleRepo vehicleRepo;

    public TokenService(GateRepo gr, VehicleRepo vehicleRepo,
                        SlotRepo slotRepo, ParkingLotRepo parkingLotRepo,
                        TicketRepo ticketRepo){
        this.gateRepo = gr;
        this.vehicleRepo = vehicleRepo;
        this.slotRepo = slotRepo;
        this.parkingLotRepo = parkingLotRepo;
        this.ticketRepo = ticketRepo;
    }

    public Ticket IssueTicket(String vehicleNumber, String vehicleOwner,
                              int gateId, VehicleType vehicleType){
        Ticket t = new Ticket();
        t.setEntryTime(new Date());
        Optional<Gate> gateOptional = gateRepo.findGateById(gateId);

        if( gateOptional.isEmpty() ){
            System.out.println("Gate is empty");
            return null;
        }
        Gate g = gateOptional.get();
        t.setGate(g);
        Vehicle v;
        Optional<Vehicle> vehicleOptional = vehicleRepo.findVehicleByNumber(vehicleNumber);
        if( vehicleOptional.isEmpty() ){
            Vehicle newVehicle = new Vehicle();
            newVehicle.setVehicleType(vehicleType);
            newVehicle.setOwnerName(vehicleOwner);
            newVehicle.setVehicleName(vehicleNumber);
            v = vehicleRepo.saveVehicle(newVehicle);
        }
        else{
            v = vehicleOptional.get();
        }

        t.setVehicle(v);
        SlotAssignmentStratergy stratergy = getSlotFactory.getSlotStrategy(g.getParkingLot().getSlotAssignmentStrategyEnum());

        if( stratergy == null ){
            throw new RuntimeException("Strategy implementation missing.");
        }
//        System.out.println("Working fine1.");
        Optional<Slot> slotOptional = stratergy.getSlot(vehicleType,g);
//        System.out.println("Working fine2.");

        if( slotOptional.isEmpty() ){
            System.out.println("Working fine.");
            throw new RuntimeException("No empty slot available");
        }
        Slot s  = slotOptional.get();
        t.setSlot(s);

        slotRepo.updateSlot(s,SlotStatus.FILLED);
        parkingLotRepo.updateCountById(g.getParkingLot());
        Ticket finalTicketWithId = ticketRepo.saveTicket(t);
        System.out.println("Final ticket is "+finalTicketWithId.getId());
        return finalTicketWithId;
    }

}
