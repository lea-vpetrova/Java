package Game;

public class Butcher extends Monster{
    Butcher(String name, int health, int power, String race) {
        super(name, 100, power, race);
    }

    @Override
    void attack(Character c) {
        int dmg = this.getPower();
        c.setHealth(c.getHealth()- dmg);
    }
}
