package BankingManagementSystem;

public class SavingAccount extends Account {

    double minimumBalance;

    public SavingAccount(String accountHolderName, double balance, int accountNumber, double minimumBalance) {
        super(accountHolderName, balance, accountNumber);
        this.minimumBalance = minimumBalance;
    }
//change the functionality from parent to child
    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.05;
        System.out.println("Interest calculated for Savings Account: " + interest);
    }

    @Override
    public void withdraw(double amount) {

    }
}

