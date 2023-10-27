package Game;

public class Witches extends Character{
    Witches(String name, int health, int power, String race) {
        super(name, health, power, race);
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
