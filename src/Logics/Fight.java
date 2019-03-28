package Logics;

import Characters.CharBase;
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
        while (player.getHp() != 0 || opponent.getHp() !=0) {               
            System.out.println("--- CONTROLES ---");
            System.out.println("1 -> Atacar.");
            System.out.println("2 -> Defender.");
            System.out.print("Escolha o número da movimentação: ");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            int nextMove = 0;
            int opMove = getRandomEvent();
            if (choice == 1) {
                for (int i = 0; i < this.player.getMoveNames().size(); i++) {
                    System.out.println((i+1)+" -> "+this.player.getMoveNames().get(i));
                }
                nextMove = s.nextInt();
                nextMove = this.player.moveList().get(nextMove-1);
                System.out.println(nextMove);
            }else {
                nextMove = this.player.GetDefenseSkill();
            }
            if (nextMove > 0) { // PLAYER ATTACK
                if (opMove>0) { // OPPONENT ATTACK
                    if (nextMove>opMove) { // DAMAGE CALCULATION
                        System.out.println("Player atacou e bot atacou, e player ganhou troca");
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
            //STAMINA RECOVERY
            player.setStamina(player.getStamina()+5);
            opponent.setStamina(opponent.getStamina()+5);
            round++;
        }
        return null;
    }
    public int getRandomEvent(){ 
        ArrayList<Integer> list = opponent.moveList();
        Random rand = new Random(); 
        return list.get(rand.nextInt(list.size()));
    } 
    

}
