package Reference;

import java.util.Scanner;
//with start method
public class ATM0 {
    private int pin;
    private double balance;
    private static final int MAX_ATTEMPTS = 3;
    public ATM0(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }
    public boolean validatePin(int enteredPin) {
        return enteredPin == pin;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void changePin(int newPin) {
        this.pin = newPin;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a single account for demonstration
        System.out.print("Enter a PIN for your new account: ");
        int accountPin = scanner.nextInt();
        System.out.print("Enter your initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        ATM0 atm = new ATM0(accountPin, initialDeposit);
        System.out.println("Account created successfully\nLogin to continue...");
        // Implement the login process
        int attempts = 0;
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();
            if (atm.validatePin(enteredPin)) {
                start(atm);
                break; // Exit the loop after successful login
            } else {
                attempts++;
                if (attempts < MAX_ATTEMPTS) {
                    System.out.println("Invalid PIN! Try again. Attempt " + attempts + " of " + MAX_ATTEMPTS);
                } else {
                    System.out.println("Invalid PIN! You have been locked out.");
                }
            }
        }
        scanner.close();
    }
    public static void start(ATM0 atm) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        while (true) {
            System.out.println("Your current balance is: ₹" + atm.getBalance());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Change PIN");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1, 2, 3, or 4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    System.out.println("Deposit successful! Your new balance is: ₹" + atm.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    if (atm.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful! Your new balance is: ₹" + atm.getBalance());
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;
                case 3:
                    System.out.print("Enter your current PIN: ");
                    int currentPin = scanner.nextInt();
                    System.out.print("Re-enter your current PIN: ");
                    int confirmPin = scanner.nextInt();
                    if (atm.validatePin(currentPin) && currentPin == confirmPin) {
                        System.out.print("Enter your new PIN: ");
                        int newPin = scanner.nextInt();
                        atm.changePin(newPin);
                        System.out.println("PIN changed successfully!");
                    } else {
                        System.out.println("PIN mismatch! Unable to change PIN.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return; // Exit the start method and end the program
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
