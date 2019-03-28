package Characters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eduardo C.
 */
public class LiuKang extends CharBase{
    Move bicycleKick;
    Move flyingDragonKick;
    
    public LiuKang(boolean b){
        this.defense = -15;
        this.isChoosen = b;
        this.name = "Liu Kang";
        this.hp = 100;
        this.stamina = 100;
        this.moveList = new ArrayList<Move>();
        this.bicycleKick = new Move("Bicycle Kick",35,15);
        this.flyingDragonKick = new Move("Flying Dragon Kick",15,5);
        this.moveList.add(bicycleKick);
        this.moveList.add(flyingDragonKick);
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
