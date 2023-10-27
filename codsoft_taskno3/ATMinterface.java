import java.util.Scanner;

class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } 
        else{
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
            return true;
        } 
        else{
            System.out.println("Invalid withdrawal amount or insufficient balance.");
            return false;
        }
    }
}

class ATM{
    private BankAccount account;

    public ATM(BankAccount account){
        this.account = account;
    }

    public void checkBalance(){
        System.out.println("Current balance: $" + account.getBalance());
    }

    public void deposit(double amount){
        account.deposit(amount);
    }

    public void withdraw(double amount){
        account.withdraw(amount);
    }
}

public class ATMinterface{
    public static void main(String[] args){
        BankAccount userAccount = new BankAccount(1000.0); // Initial account balance
        ATM atm = new ATM(userAccount);
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();
            double amount;

            switch (choice){
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter the deposit amount: $");
                    amount = scanner.nextDouble();
                    atm.deposit(amount);
                    break;

                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    amount = scanner.nextDouble();
                    atm.withdraw(amount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
