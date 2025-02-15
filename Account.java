// Base Class: Account
class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method Overloading: deposit() with different parameters
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
    }

    public void deposit(double amount, String note) {
        balance += amount;
        System.out.println("Deposited: $" + amount + " | Note: " + note + " | New Balance: $" + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds! Withdrawal failed.");
        }
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends Account {
    private double interestRate;
    private final double minBalance = 500.0; // Minimum balance required

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Overriding withdraw() to ensure balance does not fall below minimum limit
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Savings Withdrawal: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Withdrawal denied! Maintaining a minimum balance of $" + minBalance + " is required.");
        }
    }
}

// Subclass: CurrentAccount
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding withdraw() to allow overdraft up to the limit
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Current Account Withdrawal: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Withdrawal denied! Overdraft limit of $" + overdraftLimit + " exceeded.");
        }
    }
}

