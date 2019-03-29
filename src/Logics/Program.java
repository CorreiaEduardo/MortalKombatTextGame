package Logics;

import Characters.LiuKang;
import Characters.Raiden;
import java.util.Scanner;

/**
 * @author Eduardo C.
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("### UM JOGADOR - MENU PRINCIPAL###");
        System.out.println("--- ESCOLHA SEU LUTADOR ---");
        Scanner s = new Scanner(System.in);
        System.out.println("1 -> Liu Kang");
        System.out.println("2 -> Raiden");
        int charChoosen = s.nextInt();
        if (charChoosen == 1) {
            System.out.println("### ESCOLHA SEU OPONENTE:");
                System.out.println("1 -> Raiden");
                s.nextInt();
                LiuKang choosen = new LiuKang(true);
                Raiden opponent = new Raiden(false);
                Fight newFight = new Fight(choosen, opponent);
                newFight.start();
                //newFight.test();
        }else if(charChoosen == 2){
            System.out.println("### ESCOLHA SEU OPONENTE:");
            System.out.println("1 -> Liu Kang");
            s.nextInt();
            Raiden choosen = new Raiden(true);
            LiuKang opponent = new LiuKang(false);
            Fight newFight = new Fight(choosen, opponent);
            newFight.start();
        }
    }
    
}
