package codsoft;
import java.util.Scanner;
class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposit successful. New balance: " + balance);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawal successful. New balance: " + balance);
     } else if (amount > balance) {
         System.out.println("Insufficient balance.");
     } else {
         System.out.println("Withdrawal amount must be positive.");
     }
 }

 public void checkBalance() {
     System.out.println("Current balance: " + balance);
 }
}

class ATM {
 private BankAccount account;

 public ATM(BankAccount account) {
     this.account = account;
 }

 public void displayMenu() {
     System.out.println("\nATM Menu:");
     System.out.println("1. Check Balance");
     System.out.println("2. Deposit");
     System.out.println("3. Withdraw");
     System.out.println("4. Exit");
 }

 public void execute() {
     Scanner scanner = new Scanner(System.in);
     boolean exit = false;

     while (!exit) {
         displayMenu();
         System.out.print("Choose an option: ");
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 account.checkBalance();
                 break;
             case 2:
                 System.out.print("Enter amount to deposit: ");
                 double depositAmount = scanner.nextDouble();
                 account.deposit(depositAmount);
                 break;
             case 3:
                 System.out.print("Enter amount to withdraw: ");
                 double withdrawAmount = scanner.nextDouble();
                 account.withdraw(withdrawAmount);
                 break;
             case 4:
                 exit = true;
                 System.out.println("Exiting ATM. Thank you!");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }

     scanner.close();
 }
}


