public class Amazon extends Character implements IDefendable,IHealable{
    Amazon(String name) {
        super(name, 100, 20, HeroRaceEnum.Elf);
    }

    @Override
    void attackMonster(Monster m) {
        System.out.printf("%s hit %s with %d damage \n",this.getName(),m.getName(),this.getPower());
        m.setHealth(m.getHealth()-this.getPower());
    }

    @Override
    public void defend(int attackPower) {
        System.out.printf("%s protected! \n", this.getName());
        this.setHealth(this.getHealth()-attackPower);
    }

    @Override
    public void heal(Character c) {
        System.out.println("Healed by 20");
        this.setHealth(this.getHealth()+20);
    }
}
