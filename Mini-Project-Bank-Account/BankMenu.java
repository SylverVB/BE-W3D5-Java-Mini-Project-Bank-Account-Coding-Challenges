import java.util.Scanner;

/**
 * Bank Account application allowing users to interact with their bank account.
 * Users can deposit, withdraw, view balance, and exit the app.
 */
public class BankMenu {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        BankService bankService = new BankService();
        boolean banking = true;

        while(banking){
            // Display menu to user
            System.out.println("Welcome to the bank! Please select what you'd like to do:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            
            // Get user choice
            int userChoice = userInputScanner.nextInt();
            
            // Handle user choice
            if(userChoice == 1){
                System.out.print("Enter deposit amount: ");
                double amount = userInputScanner.nextDouble();
                bankService.deposit(amount);
                System.out.println("Deposit successful.");
                System.out.println("Current balance: $" + bankService.getBalance());
            }else if(userChoice == 2){
                System.out.print("Enter withdrawal amount: ");
                double amount = userInputScanner.nextDouble();
                bankService.withdraw(amount);
                System.out.println("Withdrawal successful.");
                System.out.println("Current balance: $" + bankService.getBalance());
            }else if(userChoice == 3){
                double balance = bankService.getBalance();
                System.out.println("You have: $" + balance);
            }else if(userChoice == 4){
                System.out.println("Thanks for visiting the bank!");
                banking = false;  // Exit the loop and end the program
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        // Close the scanner to prevent resource leak
        userInputScanner.close();
    }
}