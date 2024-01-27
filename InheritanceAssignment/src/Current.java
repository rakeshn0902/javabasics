public class Current extends Account {

    public Current(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        System.out.println("Your current account balance after with draw is: " + (balance - amount));
    }

    @Override
    void deposit(double amount) {
        System.out.println("Your Desposit to current account : " + amount);
    }
}
