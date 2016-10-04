/**
 * Created by cwalsh on 8/29/16.
 */
public class Account {
    public static void main(String[] args) {

        Account a1 = new Account(1, "one", "Colin", 2000);

        a1.withdraw(2000);
        a1.withdraw(200);
        System.out.println(a1.getBalance());
        a1.deposit(200);
        a1.deposit(200);
        a1.deposit(-200);
        System.out.println(a1.getBalance());
    }

        private int num;
        private String type;
        private String name;
        private double balance;

    public Account( int num, String type, String name,double balance){
            this.num = num;
            this.type = type;
            this.name = name;
            this.balance = balance;
        }

    public Account() {
            this.num = 0;
            this.type = null;
            this.name = null;
            this.balance = 0;
        }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double num) {
        if (num >= 0) balance += num;
    }

    public void withdraw(double num) {
        if ((balance - num) >= 0) balance -= num;
    }
}
