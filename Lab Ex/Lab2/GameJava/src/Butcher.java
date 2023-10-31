public class Butcher extends Monster implements IAttackable{
    Butcher(String name) {
        super(name, 100, 25, MonsterTypeEnum.Goblin);
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

    @Override
    public void takeDamage(int damage) {

    }
}
