package Characters;

/**
 * @author Eduardo C.
 */
public class Move {
    private String name;
    private String description;
    private int damage; // OR DAMAGE REDUCTION
    private int staminaCost;
    public Move(String n, int d, int s){
        this.name = n;
        this.damage = d;
        this.staminaCost = s;
    }
    public int execute(CharBase c) {
        if (c.getStamina()-this.getStaminaCost() > 0) {
            c.setStamina(c.getStamina()-this.getStaminaCost());
            return this.damage;
        } else {
            return 0;
        }
    }
    
    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getStaminaCost() {
        return staminaCost;
    }
    
}
