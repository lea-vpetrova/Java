abstract public class Character {
    //making character parameters
    private String name;
    private Integer health;
    private  Integer power;
    private HeroRaceEnum race;
    //get & set methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public HeroRaceEnum getRace() {
        return race;
    }

    public void setRace(HeroRaceEnum race) {
        this.race = race;
    }

    //constructor
    Character(String name, int health, int power, HeroRaceEnum race)
    {
        this.name = name;
        this.health = health;
        this.power = power;
        this.race = race;
    }

    abstract void attackMonster(Monster m);
    abstract void defend(int attackPower);
}
