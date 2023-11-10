public class Formula1Race implements ICompetition{
    private double winnersTime;
    private Participant[] schedule;
    @Override
    public Participant[] getSchedule() {
        return schedule;
    }
}
