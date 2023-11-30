public class Main {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();

        shelf.addBook("Книга 1");
        shelf.addBook("Книга 2");
        shelf.addBook("Книга 3");

        shelf.takeBook();
        shelf.takeBook();
        shelf.takeBook();

        shelf.takeBook();
    }
}