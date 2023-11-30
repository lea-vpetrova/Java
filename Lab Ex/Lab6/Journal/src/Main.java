public class Main {
    public static void main(String[] args) {
        EventLog log = new EventLog();
        log.addEvent("2023-01-01", "Нова година");
        log.addEvent("2023-03-15", "Ден на потребителя");
        log.addEvent("2023-05-01", "Празник на труда");

        log.getEventsBetween("2023-01-01", "2023-06-01");
    }
}