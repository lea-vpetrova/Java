public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new ShoppingCart.Item("Мляко", 2.99));
        cart.addItem(new ShoppingCart.Item("Хляб", 1.99));
        cart.addItem(new ShoppingCart.Item("Яйца", 4.49));

        double total = cart.getTotal();
        System.out.println("Total price: $" + total);
    }
}