import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            ICompetition footballMatch = CreateEvent.getEvent("FootballMatch");
            System.out.println("Football Match: " + footballMatch);

            // Initialize Competitors
            Participant[] FootballMatch = new Participant[]{
                    new Participant(1, "Beroe", 104, 2.0, 0),
                    new Participant(2, "Montana", 72, 1.4, 0)
            };

            // Fill schedule
            CreateEvent.fillSchedule(footballMatch, FootballMatch);

            // Place bets
            CreateEvent.bets(footballMatch, 2, 100);

            // Display updated schedule
            System.out.println("Updated schedule for Football Match: " + Arrays.toString(footballMatch.getSchedule()));
        } catch (EventException e){
            System.out.println("Event Exception: " + e.getMessage());
        } catch (EmptySetException e) {
            System.out.println("Empty Lineup Exception: " + e.getMessage());
        }

    }
}