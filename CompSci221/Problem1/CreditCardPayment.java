package Problem1;

/**
 * Created by cwalsh on 9/24/16.
 */
public class CreditCardPayment extends Payment{
    public CreditCardPayment(double amount, String cardHolderName, String date, long creditCardNumber) {
        super(amount);
        this.cardHolderName = cardHolderName;
        this.date = date;
        this.creditCardNumber = creditCardNumber;
    }

    private  String cardHolderName;
    private String date;
    private long creditCardNumber;

    @Override
    public String paymentDetails() {
        return "CreditCardPayment{" +
                "cardHolderName='" + cardHolderName + '\'' +
                ", Date='" + date + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                '}';
    }
}
