package Problem1;

/**
 * Created by cwalsh on 9/24/16.
 */
public class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String paymentDetails() {
        return "Payment{" +
                "amount=" + amount +
                '}';
    }
}
