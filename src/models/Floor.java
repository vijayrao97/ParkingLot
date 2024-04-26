package models;

import org.w3c.dom.ls.LSInput;

import java.util.List;

public class Floor extends BaseModel {
    private int floorNumber;
    private FloorStatus floorStatus;
    private List<Slot> parkingSlotsList;
    private List<VehicleType> allowedVehicles;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }

    public List<Slot> getParkingSlotsList() {
        return parkingSlotsList;
    }

    public void setParkingSlotsList(List<Slot> parkingSlotsList) {
        this.parkingSlotsList = parkingSlotsList;
    }

    public List<VehicleType> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<VehicleType> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }
}
