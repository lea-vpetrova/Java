public class Resource {
    private double amount;
    private double harvestRate;

    public Resource(double amount, double harvestRate) {
        this.amount = amount;
        this.harvestRate = harvestRate;
    }

    public void harvest() {
        if (amount >= harvestRate) {
            amount -= harvestRate;
            System.out.println("Harvested " + harvestRate + " units of the resource.");
        } else {
            System.out.println("Not enough resource to harvest.");
        }
    }

    public double getAmount() {
        return amount;
    }

    public double getHarvestRate() {
        return harvestRate;
    }

    public static void main(String[] args) {
        Resource resource = new Resource(100.0, 10.0);

        System.out.println("Initial resource amount: " + resource.getAmount());
        System.out.println("Harvest rate: " + resource.getHarvestRate());

        resource.harvest();

        System.out.println("Remaining resource amount: " + resource.getAmount());
    }
}
