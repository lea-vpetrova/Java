package Game;

public class Paladin extends Character {
    public Paladin(String name) {
        super(name,100,5,HeroRaceEnum.Human );
    }

    @Override
    public void attack(Monster m) {

    int dmg = this.getPower();
    m.setHealth(m.getHealth()- dmg);
    }

    @Override
    void defend(int attackPower) {
        //adding new defence
        this.setHealth(this.getHealth()-attackPower);
    }


}
