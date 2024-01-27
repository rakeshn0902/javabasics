public class Savings extends Account{

    public Savings(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        System.out.println("Your Savings balance after withdraw is: " + (balance-amount));
    }

    @Override
    void deposit(double amount) {
        System.out.println("Deposit in your savings account is: " + amount);
    }
}
