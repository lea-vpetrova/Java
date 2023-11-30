public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();

        notebook.addNote("ООП", "Основи на обектно-ориентираното програмиране");
        notebook.addNote("Java", "Увод в Java програмирането");
        notebook.addNote("Алгоритми", "Сортировки и търсения");

        notebook.findNote("ООП");
        notebook.findNote("Python");

        notebook.deleteNote("Java");

        notebook.findNote("Java");
    }
}