public class TableTennisTournament implements IEvent{
    private Integer longestMatch;
    private static Competitor[] lineup;
    public TableTennisTournament(int longestMatch){
        this.longestMatch = longestMatch;
    }
    @Override
    public Competitor[] getLineup() {
        return lineup;
    }
}
