package strategy;


import models.*;

import java.util.Optional;

public class RandomSlotGenrator implements SlotAssignmentStratergy {

    @Override
    public Optional<Slot> getSlot(VehicleType vehicleType, Gate gate) {
        ParkingLot p1 = gate.getParkingLot();
//        System.out.println("Outer loop : "+gate.getParkingLot().getFloors().size());
        for(int i=0; i<p1.getFloors().size(); i++){
//            System.out.println("First Loop working fine part 1.");
            int size = p1.getFloors().get(i).getParkingSlotsList().size();
//            System.out.println("First Loop working fine part 2."+ size);
            for(int j=0; j<size; i++){
//                System.out.println("Second Loop working fine.");
//                System.out.println(p1.getFloors().get(i).getParkingSlotsList().get(j).getSlotStatus());
                if(p1.getFloors().get(i).getParkingSlotsList().get(j).getSlotStatus().equals(SlotStatus.EMPTY)){
//                    System.out.println("Slot logic working.");
                    return Optional.ofNullable(p1.getFloors().get(i).getParkingSlotsList().get(j));
                }
            }
        }
//        System.out.println(p1.getFloors().get(0));
        return Optional.empty();
    }
}
