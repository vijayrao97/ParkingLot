package models;

import java.util.List;

public class ParkingLot extends BaseModel {
    private int capacity;
    private String name;
    private String address;
    private List<Floor> floors;
    private List<Gate> gates;
    private List<VehicleType> allowedVehicles;
    private ParkingLotStatus parkingLotStatus;
    private SlotAssignmentStrategyEnum slotAssignmentStrategyEnum;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<VehicleType> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public SlotAssignmentStrategyEnum getSlotAssignmentStrategyEnum() {
        return slotAssignmentStrategyEnum;
    }

    public void setSlotAssignmentStrategyEnum(SlotAssignmentStrategyEnum slotAssignmentStrategyEnum) {
        this.slotAssignmentStrategyEnum = slotAssignmentStrategyEnum;
    }
}
