public class Main {
    public static void main(String[] args) {
        HashTable userTable = new HashTable();

        userTable.add("user1", "user1@example.com");
        userTable.add("user2", "user2@example.com");
        userTable.add("user3", "user3@example.com");

        String email = userTable.get("user1");
        System.out.println("Email address за user1: " + email);

        String nonExistingEmail = userTable.get("nonExistingUser");
    }
}