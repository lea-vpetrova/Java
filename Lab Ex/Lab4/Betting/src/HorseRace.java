public class HorseRace implements ICompetition{
    private String breed;
    private Participant[] schedule;
    @Override
    public Participant[] getSchedule() {
        return schedule;
    }
}
