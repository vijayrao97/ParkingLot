package repo;

import models.Gate;
import models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepo {
    Map<Integer, ParkingLot> capacityMap = new HashMap<>();
    private int preInsertedId = -1;
    public ParkingLot updateCountById(ParkingLot p){
        p.setCapacity(p.getCapacity()-1);
        return p;
    }

    public ParkingLot saveParkingLot(ParkingLot p){
        int newId = preInsertedId+1;
        p.setId(newId);
        capacityMap.put(p.getId(),p);
        this.preInsertedId+=1;
        return p;
    }


}
