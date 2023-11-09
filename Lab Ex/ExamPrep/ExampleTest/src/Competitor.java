public class Competitor {
    //id, name, age, oddsToWin, betForWin
    private Integer id;
    private String name;
    private Integer age;
    private Double oddsToWin;
    private Double betForWin;

    public Competitor(int id, String name, int age, double oddsToWin, double betForWin)
    {
        this.id = id;
        this.name = name;
        this.age =age;
        this.oddsToWin = oddsToWin;
        this.betForWin = betForWin;
    }

    public double getOddsToWin(){
        return oddsToWin;
    }

    public void setOddsToWin(Double oddsToWin) {
        this.oddsToWin = oddsToWin;
    }

    public double getBetForWin(){
        return betForWin;
    }

    public void setBetForWin(double betForWin){
        this.betForWin = betForWin;
    }
}
