public class CreateEvent {
    private static String typeOfEvent;

    public static ICompetition getEvent(String competitionType) throws Exception{
         switch (competitionType) {
            case "football":
                typeOfEvent = competitionType;
                return new FootballMatch();
            case "horse race":
                typeOfEvent = competitionType;
                return new HorseRace();
            case "formula 1":
                typeOfEvent = competitionType;
                return new Formula1Race();
            default:
                throw new EventException("Invalid competition type: " + competitionType);
        }
    }

    public static void fillSchedule(ICompetition ob, Participant[] schedule) throws Exception {
        switch (typeOfEvent) {
            case "FootballMatch":
                schedule = ((FootballMatch) ob).getSchedule();
                break;
            case "HorseRace":
                schedule = ((HorseRace) ob).getSchedule();
                break;
            case "Formula1Race":
                schedule = ((Formula1Race) ob).getSchedule();
                break;
        }
        if (schedule.length == 0) {
            throw new EmptySetException("Empty set!");
        }
    }

    static void bets(ICompetition ob,int id, double bet){
        Participant[] schedule = ob.getSchedule();
        Participant person = schedule[id-1];

        double previousBetForWin = person.getBetToWin();
        double previousOddsToWin = person.getChanceToWin();

        double newBetForWin = (previousBetForWin + bet) / previousBetForWin;
        person.setBetToWin(newBetForWin);

        double newOddsToWin = Math.max(previousOddsToWin - (bet / previousBetForWin), 1.1); //Math.max ???
        person.setChanceToWin(newOddsToWin);
    }
}
