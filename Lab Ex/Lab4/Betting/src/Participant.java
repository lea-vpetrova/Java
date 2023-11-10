public class Participant {
    private int id;
    private String name;
    private int age;
    private double betToWin;
    private double chanceToWin;

    public Participant(int id, String name, int age, double betToWin, double chanceToWin){
        this.id = id;
        this.name = name;
        this.age = age;
        this.betToWin = betToWin;
        this.chanceToWin = chanceToWin;
    }

    public double getBetToWin() {
        return betToWin;
    }

    public void setBetToWin(double betToWin) {
        this.betToWin = betToWin;
    }

    public double getChanceToWin() {
        return chanceToWin;
    }

    public void setChanceToWin(double chanceToWin) {
        this.chanceToWin = chanceToWin;
    }
}
