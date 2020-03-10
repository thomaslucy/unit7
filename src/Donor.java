public class Donor {
    private double amount;
    private String name;

    public Donor(double amount, String name){
        this.amount = amount;
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " " + amount;
    }
}
