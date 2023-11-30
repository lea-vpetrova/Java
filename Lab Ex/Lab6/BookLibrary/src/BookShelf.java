import java.util.LinkedList;
import java.util.Queue;
public class BookShelf {
     private Queue<String> books;
     public BookShelf() {
         books = new LinkedList<>();
     }

     public void addBook(String book) {
         books.offer(book);
         System.out.println("Added book: " + book);
     }

     public String takeBook() {
         if (!books.isEmpty()) {
             String takenBook = books.poll();
             System.out.println("Took book: " + takenBook);
             return takenBook;
         } else {
             System.out.println("Empty shelf");
             return null;
         }
     }
}
