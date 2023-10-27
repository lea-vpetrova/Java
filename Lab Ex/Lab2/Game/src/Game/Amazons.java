package Game;

public class Amazons extends Character{
    Amazons(String name, int health, int power, String race) {
        super(name, 100, power, race);
    }

    @Override
    void attack(Monster m) {
        int dmg = this.getPower();
        m.setHealth(m.getHealth()- dmg);
    }

    @Override
    void defend(int attackPower) {
        int currentHealth = this.getHealth();
        currentHealth -= attackPower;
        this.setHealth(currentHealth);
    }


}
