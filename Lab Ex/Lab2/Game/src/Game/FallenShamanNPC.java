package Game;

public class FallenShamanNPC extends Monster implements IAttackable{
    public FallenShamanNPC(String name) {
        super(name, 100, 10, MonsterTypeEnum.Shaman);
    }

    @Override
    public void attack(Character c) {
        int dmg = this.getPower();
        c.setHealth(c.getHealth()- dmg);
    }
}
