package Game;

public class FallenShaman extends Monster{
    public FallenShaman(String name) {
        super(name, 100, 10, MonsterTypeEnum.Shaman);
    }

    @Override
    public void attack(Character c) {
        int dmg = this.getPower();
        c.setHealth(c.getHealth()- dmg);
    }
}
