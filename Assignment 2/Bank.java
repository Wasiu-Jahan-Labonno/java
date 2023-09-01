class BankAccount {
    public String name;
    public String id;
    public double balance;

    public BankAccount(String name, String id) {
        this.name = name;
        this.id = id;
        this.balance = 0.0;
    }

    public void deposit(double depAmount) {
        if (depAmount > 0) {
            balance += depAmount;
            System.out.printf("Deposited %.2f into account %s. New balance: %.2f%n", depAmount, id, balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double withAmount) {
        if (withAmount > 0 && balance >= withAmount) {
            balance -= withAmount;
            System.out.printf("Withdrew %.2f from account %s. New balance: %.2f%n", withAmount, id, balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.printf("Name: %s; Id: %s; Balance: %.2f%n", name, id, balance);
    }
}

class Bank {
    public static void main(String[] args) {
        // Create an object of the BankAccount class
        BankAccount account = new BankAccount("Wasiu jahan", "54321");

        // Assign values to attributes
        account.deposit(1500);
        account.display();

        // Withdraw money
        account.withdraw(200);
        account.display();

        // Deposit money
        account.deposit(500);
        account.display();
    }
}
