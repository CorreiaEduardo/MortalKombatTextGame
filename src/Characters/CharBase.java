package Characters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eduardo C
 */
public class CharBase {
    protected boolean isChoosen;
    protected String name;
    protected int hp;
    protected int stamina;
    public int kickGetDamage(){
        return 10;
    }
    public int punchGetDamage(){
        return 10;
    }

    public boolean isIsChoosen() {
        return isChoosen;
    }

    public void setIsChoosen(boolean isChoosen) {
        this.isChoosen = isChoosen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    
    public ArrayList<Integer> moveList(){
        ArrayList<Integer> moveList = new ArrayList<Integer>();
        return moveList;
    }
    public ArrayList<String> getMoveNames(){
        ArrayList<String> names = new ArrayList<String>();
        return names;
    }
    public int GetDefenseSkill(){
        return 0;
    }
}
