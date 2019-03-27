package Characters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eduardo C.
 */
public class Raiden extends CharBase{
    
    public Raiden(boolean b){
        this.isChoosen = b;
        this.name = "Raiden";
        this.hp = 100;
        this.stamina = 100;
    }
    
    public int lightningBoltGetDamage(){
        if (this.stamina - 10 >= 0) {
            this.stamina -= 10;
            return 25;
        } else {
            return 0;
        }
    }
    public int torpedoGetDamage(){
        if (this.stamina - 15 >= 0) {
            this.stamina -= 15;
            return 30;
        } else {
            return 0;
        }
    }
    @Override
    public int GetDefenseSkill(){
        return -20;
    }
    
    
    @Override
    public ArrayList<Integer> moveList(){
        ArrayList<Integer> moveList = new ArrayList<Integer>();
        moveList.add(lightningBoltGetDamage());
        moveList.add(torpedoGetDamage());
        moveList.add(GetDefenseSkill());
        return moveList;
    }
    public ArrayList<String> getMoveNames(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Lightning Bolt");
        names.add("Torpedo");
        return names;
    }
}
