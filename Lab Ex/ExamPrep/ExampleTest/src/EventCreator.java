public class EventCreator {
    private static String eventType;

    public EventCreator(String eventType) {
        this.eventType = eventType;
    }
    public static IEvent getEvent(String e) throws EventException {
        if (eventType.equalsIgnoreCase("basketball")) {
            return new BasketballMatch(10);
        } else if (eventType.equalsIgnoreCase("swimming")) {
            return new SwimmingEvent(10);
        } else if (eventType.equalsIgnoreCase("tabletennis")) {
            return new TableTennisTournament(10);
        } else {
            throw new EventException("Invalid competition type: " + eventType);
        }
    }

    public static void fillLineup(IEvent ob, Competitor[] lineup) throws EmptyLineupException {
        if (lineup.length == 0) {
            throw new EmptyLineupException("Lineup is empty.");
        }
        ob.getLineup();
    }
    public static void placeBet(IEvent ob, int competitorId, double bet){
        Competitor[] lineup = ob.getLineup();

        Competitor competitor = lineup[competitorId - 1];
        double previousBetForWin = competitor.getBetForWin();
        double previousOddsToWin = competitor.getOddsToWin();

        double newBetForWin = (previousBetForWin + bet) / previousBetForWin;
        double newOddsToWin = Math.max(previousOddsToWin - (bet / previousBetForWin), 1.05);

        competitor.setBetForWin(newBetForWin);
        competitor.setOddsToWin(newOddsToWin);
    }
}
