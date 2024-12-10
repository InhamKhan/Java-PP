package BankingManagementSystem;

public abstract class Account {
     private String accountHolderName;
   private  double balance;
   private  int accountNumber;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(String accountHolderName, double balance, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
public void calculateInterest(){
            System.out.println("calculated the Interest rate in it......");
        }
        public void deposit(double amount){
            System.out.println("Check the amount is deposited.?");
        }
        public void withdraw(double amount){
            System.out.println("Check the amount is withdraw.?");
        }
}

