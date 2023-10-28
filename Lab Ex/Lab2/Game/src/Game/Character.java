package Game;

abstract public class Character {
    private String name;
    private Integer health;
    private Integer power;
    private String race;

    Character(String name, int health, int power, String race)
    {
        this.name = name;
        this.health = health;
        this.power = power;
        this.race = race;
    }

    abstract void attack(Monster m);

    abstract void defend();

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

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
