public class FootballMatch implements ICompetition{
    private double fastestGoal;
    private Participant[] schedule;
    @Override
    public Participant[] getSchedule() {
        return schedule;
    }
}
