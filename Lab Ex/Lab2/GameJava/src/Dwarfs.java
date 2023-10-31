public class Dwarfs extends Character{
    Dwarfs(String name) {
        super(name, 80, 10, HeroRaceEnum.Dwarf);
    }

    @Override
    void attackMonster(Monster m) {
        System.out.printf("%s hit %s with %d damage \n",this.getName(),m.getName(),this.getPower());
        m.setHealth(m.getHealth()-this.getPower());
    }
}
