package models;

public class Slot {
    private int slotNumber;
    private VehicleType vehicleType;
    private SlotStatus slotStatus;
    private Floor parkingFloor;

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public SlotStatus getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(SlotStatus slotStatus) {
        this.slotStatus = slotStatus;
    }

    public Floor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(Floor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
