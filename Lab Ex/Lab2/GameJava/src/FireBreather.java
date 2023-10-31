public class FireBreather extends Monster{
    FireBreather(String name) {
        super(name, 100, 40, MonsterTypeEnum.Dragon);
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
