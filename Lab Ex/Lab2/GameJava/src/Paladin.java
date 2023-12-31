public class Paladin extends Character implements IDefendable,IHealable{
    Paladin(String name) {
        super(name, 100, 40, HeroRaceEnum.Human);
    }

    @Override
    void attackMonster(Monster m) {
        System.out.printf("%s hit %s with %d damage \n",this.getName(),m.getName(),this.getPower());
        m.setHealth(m.getHealth()-this.getPower());
    }

    @Override
    public void defend(int attackPower) {
        System.out.println("Is protected by holy grail!");
        this.setHealth(this.getHealth()-attackPower);
    }

    @Override
    public void heal(Character c) {
        System.out.println("Healed by 10");
        this.setHealth(this.getHealth()+10);
    }
}
