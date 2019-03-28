package Characters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eduardo C.
 */
public class Raiden extends CharBase{
    Move lightningBolt;
    Move torpedo;
    
    public Raiden(boolean b){
        this.defense = -20;
        this.isChoosen = b;
        this.name = "Raiden";
        this.hp = 100;
        this.stamina = 100;
        this.moveList = new ArrayList<>();
        this.lightningBolt = new Move("Lightning Bolt", 25,10);
        this.torpedo = new Move("Torpedo", 30,12);
        this.moveList.add(lightningBolt);
        this.moveList.add(torpedo);
        
    }
    
    @Override
    public int GetDefenseSkill(){
        return this.defense;
    }
    
    
    @Override
    public ArrayList<Move> getMoveList(){
        return this.moveList;
    }
}
