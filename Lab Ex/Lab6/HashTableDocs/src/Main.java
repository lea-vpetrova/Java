import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DocumentHashTable docs = new DocumentHashTable();

        docs.addDocument(1, Arrays.asList("ООП", "Програмиране"));
        docs.addDocument(2, Arrays.asList("Java", "ООП", "Уеб разработка"));
        docs.addDocument(3, Arrays.asList("Алгоритми", "Структури от данни"));

        docs.search("ООП");
        docs.search("Java");
        docs.search("SQL");
    }
}