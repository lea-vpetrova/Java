import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        try {
            ICompetition FootballMatch = CreateEvent.getEvent("football");
            ICompetition HorseRace = CreateEvent.getEvent("horse race");
            ICompetition Formula1Race = CreateEvent.getEvent("formula 1");

            System.out.println("Football Match: " + FootballMatch);
            System.out.println("Horse Race: " + HorseRace);
            System.out.println("Formula 1 Race: " + Formula1Race);

            // Initialize Competitors
            Participant[] footballMatch = new Participant[]{
                    new Participant(1, "Team A", 25, 2.0, 0),
                    new Participant(2, "Team B", 27, 1.8, 0),
                    new Participant(3, "Team C", 22, 1.5, 0)
            };

            Participant[] horseRace = new Participant[]{
                    new Participant(101, "Swimmer X", 30, 1.5, 0),
                    new Participant(102, "Swimmer Y", 28, 2.0, 0),
                    new Participant(103, "Swimmer Z", 24, 1.7, 0)
            };

            Participant[] formula1Race = new Participant[]{
                    new Participant(201, "Player 1", 21, 3.0, 0),
                    new Participant(202, "Player 2", 22, 2.5, 0),
                    new Participant(203, "Player 3", 23, 2.2, 0)
            };

            // Fill lineups
            CreateEvent.fillSchedule(FootballMatch,footballMatch);
            CreateEvent.fillSchedule(HorseRace,horseRace);
            CreateEvent.fillSchedule(Formula1Race,formula1Race);

            // Place bets
            CreateEvent.bets(FootballMatch,2,100);
            CreateEvent.bets(HorseRace, 103, 50);
            CreateEvent.bets(Formula1Race,201,75);

            // Display updated lineup
            System.out.println("Updated Schedule for Football Match: " + Arrays.toString(FootballMatch.getSchedule()));
            System.out.println("Updated Schedule for Horse Race: " + Arrays.toString(HorseRace.getSchedule()));
            System.out.println("Updated Schedule for Formula 1 Race: " + Arrays.toString(Formula1Race.getSchedule()));
        } catch (EventException e) {
            System.out.println("Event Exception: " + e.getMessage());
        } catch (EmptySetException e) {
            System.out.println("Empty Schedule Exception: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}