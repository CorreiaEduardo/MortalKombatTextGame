package Characters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eduardo C.
 */
public class LiuKang extends CharBase{
    public LiuKang(boolean b){
        this.isChoosen = b;
        this.name = "Liu Kang";
        this.hp = 100;
        this.stamina = 100;
    }
    public int bicycleKickGetDamage(){
        if (this.stamina - 15 >= 0) {
            this.stamina -= 15;
            return 85;
        } else {
            return 0;
        }
    }
    public int flayingDragonKickGetDamage(){
        if (this.stamina - 5 >= 0) {
            this.stamina -= 5;
            return 15;
        } else {
            return 0;
        }
    }
    @Override
    public int GetDefenseSkill(){
        return -15;
    }
    @Override
    public ArrayList<Integer> moveList(){
        ArrayList<Integer> moveList = new ArrayList<Integer>();
        moveList.add(bicycleKickGetDamage());
        moveList.add(flayingDragonKickGetDamage());
        moveList.add(GetDefenseSkill());
        return moveList;
    }
    @Override
    public ArrayList<String> getMoveNames(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bicycle Kick");
        names.add("Flaying Dragon Kick");
        return names;
    }
}
