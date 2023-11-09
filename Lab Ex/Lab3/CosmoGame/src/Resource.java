abstract public class Resource {
    private Double amount;
    private Double harvestRate;

    Resource(double amount, double harvestRate){
        this.amount = amount;
        this.harvestRate = harvestRate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getHarvestRate() {
        return harvestRate;
    }

    public void setHarvestRate(Double harvestRate) {
        this.harvestRate = harvestRate;
    }

    abstract public void harvest();
}
