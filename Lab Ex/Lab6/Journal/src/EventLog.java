import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventLog {

    private static class Event {
        private Date timestamp;
        private String description;

        public Event(Date timestamp, String description) {
            this.timestamp = timestamp;
            this.description = description;
        }

        public Date getTimestamp() {
            return timestamp;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return "[" + dateFormat.format(timestamp) + "] " + description;
        }
    }
    private List<Event> events;

    public EventLog() {
        events = new ArrayList<>();
    }
    public void addEvent(String timestamp, String description) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(timestamp);
            Event event = new Event(date, description);
            events.add(event);
            System.out.println("Added event: " + event);
        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void getEventsBetween(String startDate, String endDate) {
        List<Event> eventsInRange = new ArrayList<>();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date start = dateFormat.parse(startDate);
            Date end = dateFormat.parse(endDate);

            for (Event event : events) {
                if (event.getTimestamp().after(start) && event.getTimestamp().before(end)) {
                    eventsInRange.add(event);
                }
            }

            System.out.println("Event in the interval [" + startDate + " - " + endDate + "]: " + eventsInRange);
        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
