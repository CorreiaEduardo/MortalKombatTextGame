package Characters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eduardo C.
 */
public class LiuKang extends CharBase{
    Move bicycleKick;
    Move flyingDragonKick;
    Move parry;
    
    public LiuKang(boolean b){
        this.defense = -15;
        this.isChoosen = b;
        this.name = "Liu Kang";
        this.hp = 100;
        this.stamina = 100;
        this.moveList = new ArrayList<Move>();
        this.bicycleKick = new Move("Bicycle Kick",25,15);
        this.flyingDragonKick = new Move("Flying Dragon Kick",15,5);
        this.parry = new Move("Parry",-15,0);
        this.moveList.add(bicycleKick);
        this.moveList.add(flyingDragonKick);
        this.moveList.add(parry);
    }
    
    public Move getDefenseSkill(){
        return this.parry;
    }
    
    @Override
    public ArrayList<Move> getMoveList(){
        return this.moveList;
    }
    
}
