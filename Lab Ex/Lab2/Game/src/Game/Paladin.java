package Game;

public class Paladin extends Character {
    Paladin(String name, int health, int power, String race) {
        super(name, health, power, race);
    }

    @Override
    void attack(Monster m) {
    int dmg = this.getPower();
    m.setHealth(m.getHealth()- dmg);
    }

    @Override
    void defend() {

    }
}
