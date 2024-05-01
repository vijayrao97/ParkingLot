package strategy;

import models.Gate;
import models.Slot;
import models.VehicleType;

import java.util.Optional;

public interface SlotAssignmentStratergy {
    public Optional<Slot> getSlot(VehicleType vehicleType, Gate gate);
}
