package repo;

import models.Gate;
import models.Slot;
import models.SlotStatus;

import java.util.HashMap;
import java.util.Map;

public class SlotRepo {
    Map<Integer, Slot> slotMap = new HashMap<>();
    private int preInsertedId = -1;
    public Slot updateSlot(Slot s, SlotStatus sStatus){
        Slot slot = s;
        slot.setSlotStatus(sStatus);
        return slot;
    }

    public Slot saveGate(Slot s){
        int newId = preInsertedId+1;
        s.setSlotNumber(newId);
        slotMap.put(s.getSlotNumber(),s);
        this.preInsertedId+=1;
        return s;
    }

}
