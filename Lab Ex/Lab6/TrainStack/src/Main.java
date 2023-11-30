public class Main {
    public static void main(String[] args) {
        Train myTrain = new Train();
        myTrain.push("Wagon 1");
        myTrain.push("Wagon 2");
        myTrain.push("Wagon 3");

        myTrain.displayTrain();

        myTrain.pop();
        myTrain.displayTrain();

        myTrain.pop();
        myTrain.displayTrain();

        myTrain.pop();
        myTrain.displayTrain();
    }
}