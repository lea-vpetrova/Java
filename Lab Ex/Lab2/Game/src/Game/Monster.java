package Game;

abstract class Monster {
    private String name;
    private Integer health;
    private Integer power;
    private MonsterTypeEnum race;
    Monster(String name, int health, int power, MonsterTypeEnum race)
    {
        this.name = name;
        this.health = health;
        this.power = power;
        this.race = race;
    }
     abstract void attack(Character c);

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

    public MonsterTypeEnum getRace() {
        return race;
    }

    public void setRace(MonsterTypeEnum race) {
        this.race = race;
    }
}
