package Problem1;

/**
 * Created by cwalsh on 9/24/16.
 */
public class Main {

    public static void main(String[] args){
        CashPayment payment1 = new CashPayment(2400);

        CreditCardPayment payment2 = new CreditCardPayment(3000, "Colin", "3/4/2999", 340982323);

       System.out.println(payment1.paymentDetails());
       System.out.println(payment2.paymentDetails());


    }
}
