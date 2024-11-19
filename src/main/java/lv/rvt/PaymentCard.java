package lv.rvt;

public class PaymentCard {
    private double balance;

    // Constructor
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    // Method to handle eating costs
    private void deductAmount(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
    }

    // eatAffordably method
    public void eatAffordably() {
        deductAmount(2.60);
    }

    // eatHeartily method
    public void eatHeartily() {
        deductAmount(4.60);
    }

    // addMoney method
    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance = Math.min(this.balance + amount, 150);
        }
    }

    // toString method
    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
