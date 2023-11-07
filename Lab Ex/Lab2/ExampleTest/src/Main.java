import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            IEvent basketballMatch = EventCreator.getEvent("basketball");
            IEvent swimmingEvent = EventCreator.getEvent("swimming");
            IEvent tableTennisTournament = EventCreator.getEvent("tabletennis");

            System.out.println("Basketball Event: " + basketballMatch);
            System.out.println("Swimming Event: " + swimmingEvent);
            System.out.println("Table Tennis Event: " + tableTennisTournament);

            // Initialize Competitors
            Competitor[] basketballCompetitors = new Competitor[]{
                    new Competitor(1, "Team A", 25, 2.0, 0),
                    new Competitor(2, "Team B", 27, 1.8, 0),
                    new Competitor(3, "Team C", 22, 1.5, 0)
            };

            Competitor[] swimmingCompetitors = new Competitor[]{
                    new Competitor(101, "Swimmer X", 30, 1.5, 0),
                    new Competitor(102, "Swimmer Y", 28, 2.0, 0),
                    new Competitor(103, "Swimmer Z", 24, 1.7, 0)
            };

            Competitor[] tableTennisCompetitors = new Competitor[]{
                    new Competitor(201, "Player 1", 21, 3.0, 0),
                    new Competitor(202, "Player 2", 22, 2.5, 0),
                    new Competitor(203, "Player 3", 23, 2.2, 0)
            };

            // Fill lineups
            EventCreator.fillLineup(basketballMatch, basketballCompetitors);
            EventCreator.fillLineup(swimmingEvent, swimmingCompetitors);
            EventCreator.fillLineup(tableTennisTournament, tableTennisCompetitors);

            // Place bets
            EventCreator.placeBet(basketballMatch, 2, 100);
            EventCreator.placeBet(swimmingEvent, 103, 50);
            EventCreator.placeBet(tableTennisTournament, 203, 75);

            // Display updated lineup
            System.out.println("Updated Lineup for Basketball: " + Arrays.toString(basketballMatch.getLineup()));
            System.out.println("Updated Lineup for Swimming: " + Arrays.toString(swimmingEvent.getLineup()));
            System.out.println("Updated Lineup for Table Tennis: " + Arrays.toString(tableTennisTournament.getLineup()));
        } catch (EventException e) {
            System.out.println("Event Exception: " + e.getMessage());
        } catch (EmptyLineupException e) {
            System.out.println("Empty Lineup Exception: " + e.getMessage());
        }

    }
}