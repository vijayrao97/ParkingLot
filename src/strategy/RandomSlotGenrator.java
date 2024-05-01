package strategy;


import models.Gate;
import models.Slot;
import models.VehicleType;

import java.util.Optional;

public class RandomSlotGenrator implements SlotAssignmentStratergy {

    @Override
    public Optional<Slot> getSlot(VehicleType vehicleType, Gate gate) {
        return Optional.empty();
    }
}
