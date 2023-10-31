public class Game {
    public static void main(String[] args) {
        Paladin p = new Paladin("Pad");
        Butcher b = new Butcher("Buch");

        battle(p,b);
    }

    public static void battle(Character p, Monster m){
        if (m instanceof IAttackable){
            while (p.isAlive() && m.isAlive()){
                p.attackMonster(m);
                if (m.isAlive()){
                    m.attackChar(p);
                }
                if (p instanceof IHealable){
                    ((IHealable)p).heal(p);
                }
                if(!(m.isAlive())){
                    System.out.println(p.getName() + " won");
                    break;
                }
                if(!(p.isAlive())){
                    System.out.println(m.getName() + " won");
                    break;
                }
            }
        }
        else {
            m.attackChar(p);
        }

    }
}