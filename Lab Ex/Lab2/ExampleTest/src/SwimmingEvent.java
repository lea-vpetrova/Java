public class SwimmingEvent implements IEvent{
    private Integer fastestLap;
    private static Competitor[] lineup;

    public SwimmingEvent(int fastestLap){
        this.fastestLap = fastestLap;
    }

    @Override
    public Competitor[] getLineup() {
        return lineup;
    }
}
