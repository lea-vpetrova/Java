public class FallenShaman extends Monster implements IAttackable{
    FallenShaman(String name) {
        super(name, 100, 50, MonsterTypeEnum.Shaman);
    }

    @Override
    public void takeDamage(int damage) {

    }

    @Override
    void attackChar(Character c) {
        System.out.printf("%s hit %s with %d damage \n",this.getName(),c.getName(),this.getPower());
        if(c instanceof IDefendable){
            ((IDefendable)c).defend(this.getPower());
        }else {

            c.setHealth(c.getHealth()-this.getPower());
        }
    }
}
