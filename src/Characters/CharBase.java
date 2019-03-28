package Characters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eduardo C
 */
public abstract class CharBase {
    protected boolean isChoosen;
    protected String name;
    protected int hp;
    protected int stamina;
    int defense;
    ArrayList<Move> moveList;
    public int kickGetDamage(){
        return 10;
    }
    public int punchGetDamage(){
        return 10;
    }

    public boolean isIsChoosen() {
        return this.isChoosen;
    }

    public void setIsChoosen(boolean isChoosen) {
        this.isChoosen = isChoosen;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    
    public abstract ArrayList<Move> getMoveList();
    
    //public abstract ArrayList<String> getMoveNames();
    
    public int GetDefenseSkill(){
        return 0;
    }
    
    public ArrayList<String> getMoveNames(){
        ArrayList<String> moveNames = new ArrayList<>();
        for(Move node : this.getMoveList()){
            moveNames.add(node.getName());
        }
        
        return moveNames;
    }
}
