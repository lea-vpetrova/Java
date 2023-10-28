package Game;

public class FallenShaman extends Monster{
    FallenShaman(String name, int health, int power, String race) {
        super(name, health, power, race);
    }

    @Override
    void attack(Character c) {
        int dmg = this.getPower();
        c.setHealth(c.getHealth()- dmg);
    }
}
