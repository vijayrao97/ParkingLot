package models;

import java.util.List;

public class ParkingLot extends BaseModel {
    private List<Floor> parkingFloor;
    private List<Gate> gates;
    private String name;
    private String address;
    private List<VehicleType> allowedVehicles;
    private int capacity;
    private ParkingLotStatus parkingLotStatus;
    private SlotAssignmentStrategy slotAssignmentStrategy;

    public List<Floor> getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(List<Floor> parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<VehicleType> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<VehicleType> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public SlotAssignmentStrategy getSlotAssignmentStrategy() {
        return slotAssignmentStrategy;
    }

    public void setSlotAssignmentStrategy(SlotAssignmentStrategy slotAssignmentStrategy) {
        this.slotAssignmentStrategy = slotAssignmentStrategy;
    }
}
