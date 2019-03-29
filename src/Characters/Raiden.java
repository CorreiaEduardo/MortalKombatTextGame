package Characters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eduardo C.
 */
public class Raiden extends CharBase{
    Move lightningBolt;
    Move torpedo;
    Move teleport;
    
    public Raiden(boolean b){
        this.defense = -20;
        this.isChoosen = b;
        this.name = "Raiden";
        this.hp = 100;
        this.stamina = 100;
        this.moveList = new ArrayList<>();
        this.lightningBolt = new Move("Lightning Bolt", 30,15);
        this.torpedo = new Move("Torpedo", 20,15);
        this.teleport = new Move("Teleport", -20,5);
        this.moveList.add(lightningBolt);
        this.moveList.add(torpedo);
        this.moveList.add(teleport);
        
    }
    
    public Move getDefenseSkill(){
        return this.teleport;
    }
    
    @Override
    public ArrayList<Move> getMoveList(){
        return this.moveList;
    }
}
