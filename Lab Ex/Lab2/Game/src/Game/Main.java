package Game;

import Game.FallenShaman;
import Game.Paladin;

public class Main {
    public static void main(String[] args) {
        Paladin human = new Paladin("Pad");
        FallenShaman shaman = new FallenShaman("Sham");

        while(true){
            human.attack(shaman);
            System.out.println(shaman.getHealth());
            shaman.attack(human);
            System.out.println(human.getHealth());
            if(shaman.getHealth() <= 0){
                System.out.println(human.getName() + " won");
                System.out.println(human.getHealth());
                break;
            }
            if (human.getHealth() <= 0){
                System.out.println(shaman.getName() + " won");
                System.out.println(shaman.getHealth());
                break;
            }
        }
    }
    public static  void battle(Character c, Monster m ){

    }
}