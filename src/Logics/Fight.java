package Logics;

import Characters.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Eduardo C.
 */
public class Fight {
    private CharBase player;
    private CharBase opponent;
    public Fight(CharBase c, CharBase op){
        this.player = c;
        this.opponent = op;
    }
    public CharBase start(){
        int round = 1;
        while (player.getHp() > 0 || opponent.getHp() > 0) {
            if (player.getHp() < 0 || opponent.getHp() < 0) {
                break;
            }
            System.out.println("--- CONTROLES ---");
            System.out.println("1 -> Atacar.");
            System.out.println("2 -> Defender.");
            System.out.print("Escolha o número da movimentação: ");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            int nextMove = 0;
            int opMove = getRandomEvent();
            System.out.println(opMove);
            int i = 0;
            if (choice == 1) {
                for (i = 0; i < this.player.getMoveNames().size(); i++) {
                    System.out.println((i+1)+" -> "+this.player.getMoveNames().get(i));
                }
                nextMove = s.nextInt();
                i = nextMove;
                nextMove = this.player.getMoveList().get(nextMove-1).execute(player);
                System.out.println(nextMove);
            }else {
                nextMove = this.player.getDefenseSkill().execute(player);
            }
            if (nextMove > 0) { // PLAYER ATTACK
                if (opMove>0) { // OPPONENT ATTACK
                    if (nextMove>opMove) { // DAMAGE CALCULATION
                        System.out.println("Player: HAYAAAAAA! "+this.player.getMoveNames().get(i-1)+"\nBOT: UGHH");
                        this.opponent.setHp(this.opponent.getHp()-(nextMove-opMove));
                    } else {
                        System.out.println("Player atacou e bot atacou, mas player perdeu troca");
                        this.player.setHp(this.player.getHp()-(opMove-nextMove));
                    }
                } else {
                    opMove*=-1;
                    if (opMove<nextMove) {
                        System.out.println("Player atacou e bot defendeu");
                        this.opponent.setHp(this.opponent.getHp()-(nextMove-opMove));
                    }else{
                        System.out.println("bot absorveu dano");
                    }
                }
            } else {
                if (opMove > 0) {// OPPONENT ATTACK
                    nextMove*=-1;
                    System.out.println("Player defendeu e bot atacou");
                    if (nextMove<opMove) {
                        this.player.setHp(this.player.getHp()-(opMove-nextMove));
                    }
                } else {
                    System.out.println("??");
                }
            }
            System.out.println("                   ### ROUND "+round+" ###");
            System.out.print("Seu HP: "+this.player.getHp());
            System.out.print("                            ");
            System.out.println("HP do inimigo "+this.opponent.getHp());
            System.out.print("Sua STAMINA: "+this.player.getStamina());
            //STAMINA RECOVERY
            player.setStamina(player.getStamina()+5);
            opponent.setStamina(opponent.getStamina()+5);
            round++;
        }
        return null;
    }
    public void test(){
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandomEvent());
        }
    }
    public int getRandomEvent(){ 
        ArrayList<Integer> list = new ArrayList<>();
        for(Move node : this.opponent.getMoveList()){
            list.add(node.getDamage());
        }
        Random rand = new Random(); 
        return list.get(rand.nextInt(list.size()));
    } 
    

}
