import java.util.ArrayList;
import java.util.List;
public class Train {
    private List<String> wagons;
    public Train() {
        wagons = new ArrayList<>();
    }

    public void push(String wagon) {
        wagons.add(wagon);
        System.out.println("Added wagon: " + wagon);
    }

    public void pop() {
        if (!wagons.isEmpty()) {
            String removedWagon = wagons.remove(wagons.size() - 1);
            System.out.println("A wagon was removed: " + removedWagon);
        } else {
            System.out.println("Train is empty");
        }
    }

    public void displayTrain() {
        if (!wagons.isEmpty()) {
            System.out.println("Train info:");
            for (String wagon : wagons) {
                System.out.println("Wagon: " + wagon);
            }
        } else {
            System.out.println("Train is empty");
        }
    }
}