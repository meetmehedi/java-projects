// Main Class to Demonstrate Polymorphism
public class Main {
    public static void main(String[] args) {
        // Creating Savings Account
        SavingsAccount savings = new SavingsAccount("M04", 1000, 3.5);
        savings.deposit(500);
        savings.withdraw(800); // Should succeed
        savings.withdraw(300); // Should fail due to min balance rule

        System.out.println("---------------------------------");

        // Creating Current Account
        CurrentAccount current = new CurrentAccount("R38", 2000, 1000);
        current.deposit(1000, "Salary Deposit");
        current.withdraw(2500); // Should succeed within overdraft limit
        current.withdraw(1000); // Should fail due to overdraft limit
    }
}