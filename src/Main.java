import Controller.TicketController;
import DTO.IssueTicketRequest;
import DTO.IssueTicketResponse;
import Services.TokenService;
import models.*;
import repo.*;

import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GateRepo gr = new GateRepo();
        // TODO: populate data..
        Gate g1 = new Gate();
        g1.setGateNumber(1);
        g1.setGateType(GateType.ENTRY);
        g1.setGateStatus(GateStatus.OPEN);


        Gate g2 = new Gate();
        g2.setGateNumber(2);
        g2.setGateType(GateType.EXIT);
        g2.setGateStatus(GateStatus.OPEN);



        VehicleRepo vr = new VehicleRepo();
        // TODO: populate data..
        Vehicle v1 = new Vehicle();
        v1.setId(1);
        v1.setVehicleName("BMW");
        v1.setOwnerName("Vijay");
        v1.setVehicleType(VehicleType.CAR);
        vr.saveVehicle(v1);

        SlotRepo sr = new SlotRepo();
        // TODO: populate data..

        Floor f1 = new Floor();
        f1.setAllowedVehicles(List.of(VehicleType.BIKE,VehicleType.CAR));
        f1.setFloorNumber(1);
        f1.setFloorStatus(FloorStatus.OPEN);

        Slot s1 = new Slot();
        s1.setSlotNumber(1);
        s1.setParkingFloor(f1);
        s1.setVehicleType(VehicleType.CAR);
        s1.setSlotStatus(SlotStatus.EMPTY);

        Slot s2 = new Slot();
        s2.setSlotNumber(2);
        s2.setParkingFloor(f1);
        s2.setVehicleType(VehicleType.CAR);
        s2.setSlotStatus(SlotStatus.EMPTY);

        f1.setParkingSlotsList(List.of(s1,s2));

        sr.saveGate(s1);
        sr.saveGate(s2);

        ParkingLotRepo parkingLotRepo = new ParkingLotRepo();
        // TODO: populate data..
        ParkingLot p1 = new ParkingLot();
        p1.setId(1);
        p1.setAddress("Dadar");
        p1.setCapacity(100);
        p1.setFloors(List.of(f1));
        p1.setGates(List.of(g1,g2));
        p1.setName("Carpark");
        p1.setAllowedVehicles(List.of(VehicleType.BIKE,VehicleType.CAR));
        p1.setParkingLotStatus(ParkingLotStatus.OPEN);
        p1.setSlotAssignmentStrategyEnum(SlotAssignmentStrategyEnum.Random);

        g1.setParkingLot(p1);
        g2.setParkingLot(p1);

        gr.saveGate(g1);
        gr.saveGate(g2);

        TicketRepo ticketRepo = new TicketRepo();
        TokenService tokenService = new TokenService(gr,
                vr,sr,parkingLotRepo,ticketRepo);

        TicketController ticketController = new TicketController(tokenService);


        IssueTicketRequest request = new IssueTicketRequest();

        request.setGateId(1);
        request.setOwnerName("abc");
        request.setVehicleNo("124");
        request.setVehicleType(VehicleType.CAR);

        // RESPONSE DTO..
        IssueTicketResponse response = ticketController.IssueTicket(request);
        System.out.println(response.getVehicle().getVehicleType());

        IssueTicketRequest request1 = new IssueTicketRequest();

        request1.setGateId(1);
        request1.setOwnerName("abc");
        request1.setVehicleNo("124");
        request1.setVehicleType(VehicleType.CAR);

        // RESPONSE DTO..
        IssueTicketResponse response1 = ticketController.IssueTicket(request1);
        if( response1 != null ){
            System.out.println(response1.getSlot().getVehicleType());
        }


        IssueTicketRequest request2 = new IssueTicketRequest();

        request2.setGateId(1);
        request2.setOwnerName("abc");
        request2.setVehicleNo("124");
        request2.setVehicleType(VehicleType.CAR);

        // RESPONSE DTO..
        IssueTicketResponse response2 = ticketController.IssueTicket(request2);
        if( response2 != null ){
            System.out.println(response2.getSlot());
        }

        // BILL GENERATE..
//        Bill b1 = new Bill();
//        b1.setExitDate(new Date());
//        b1.setExitedAt(g2);
//        b1.setBillStatus(BillStatus.PENDING);
//        b1.setTotalAmount(100);




    }
}