import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Notebook {
    private static class Note {
        private String title;
        private String content;

        public Note(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return "[" + title + "] " + content;
        }
    }
    private List<Note> notes;

    public Notebook() {
        notes = new ArrayList<>();
    }
    public void addNote(String title, String content) {
        Note note = new Note(title, content);
        notes.add(note);
        System.out.println("Added note: " + note);
    }
    public void findNote(String title) {
        for (Note note : notes) {
            if (note.getTitle().equals(title)) {
                System.out.println("Note found: " + note);
                return;
            }
        }
        System.out.println("Note title '" + title + "' is not found.");
    }
    public void deleteNote(String title) {
        Iterator<Note> iterator = notes.iterator();
        while (iterator.hasNext()) {
            Note note = iterator.next();
            if (note.getTitle().equals(title)) {
                iterator.remove();
                System.out.println("Deleted note: " + note);
                return;
            }
        }
        System.out.println("Note title '" + title + "' not found for deleting.");
    }
}
