package strategy;

import models.SlotAssignmentStrategyEnum;

public class getSlotFactory {
    public static SlotAssignmentStratergy getSlotStrategy(SlotAssignmentStrategyEnum e){
        if( e.equals(SlotAssignmentStrategyEnum.Random) ){
            return new RandomSlotGenrator();
        }
        return null;
    }
}
