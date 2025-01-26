public class BankService {
    // The balance should be kept private to prevent unintended access and modification.
    private double balance;

    // Constructor that initializes the balance to 0.
    public BankService(){
        this.balance = 0;
    }

    /**
     * Increases the user's balance by the specified amount.
     * @param amount the amount to be deposited.
     */
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * Decreases the user's balance by the specified amount if the withdrawal would not result in a negative balance.
     * @param amount the amount to be withdrawn.
     */
    public void withdraw(double amount){
        if (amount > 0 && balance - amount >= 0) {
            balance -= amount;
        } else if (amount > 0) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    /**
     * Returns the current balance.
     * @return the user's current balance.
     */
    public double getBalance(){
        return balance;
    }
}