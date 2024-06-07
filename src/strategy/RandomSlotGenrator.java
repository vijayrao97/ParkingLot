package strategy;


import models.*;

import java.util.Optional;

public class RandomSlotGenrator implements SlotAssignmentStratergy {

    @Override
    public Optional<Slot> getSlot(VehicleType vehicleType, Gate gate) {
        ParkingLot p1 = gate.getParkingLot();
        for(int i=0; i<p1.getFloors().size(); i++){
            int size = p1.getFloors().get(i).getParkingSlotsList().size();
            for(int j=0; j<size; j++){
                SlotStatus s = p1.getFloors().get(i).getParkingSlotsList().get(j).getSlotStatus();
                VehicleType vt = p1.getFloors().get(i).getParkingSlotsList().get(j).getVehicleType();
                if(s.equals(SlotStatus.EMPTY) && vt.equals(vehicleType)  ){
                    return Optional.ofNullable(p1.getFloors().get(i).getParkingSlotsList().get(j));
                }
            }
        }
        return Optional.empty();
    }
}
