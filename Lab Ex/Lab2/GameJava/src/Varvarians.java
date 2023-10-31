public class Varvarians extends Character{
    Varvarians(String name) {
        super(name, 100, 50, HeroRaceEnum.Orc);
    }

    @Override
    void attackMonster(Monster m) {
        System.out.printf("%s hit %s with %d damage \n",this.getName(),m.getName(),this.getPower());
        m.setHealth(m.getHealth()-this.getPower());
    }
}
