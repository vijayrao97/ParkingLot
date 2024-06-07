package repo;

import models.Gate;
import models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepo {
    private Map<Integer, Gate> gateMap = new HashMap<>();
    private int preInsertedId = -1;
    public Optional<Gate> findGateById(int gateId){
        if( gateMap.containsKey(gateId) ){
            return Optional.of(gateMap.get(gateId));
        }
        return Optional.empty();
    }

    public Gate saveGate(Gate g){
        int newId = preInsertedId+1;
        g.setId(newId);
        gateMap.put(g.getGateNumber(),g);
        this.preInsertedId+=1;
        return g;
    }

}
