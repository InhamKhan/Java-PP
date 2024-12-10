package BankingManagementSystem;

public class CheckingAccount extends Account {

    double overdraftLimit;

    public CheckingAccount(String accountHolderName, double balance, int accountNumber, double overdraftLimit) {
        super(accountHolderName, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }



    @Override
    public void calculateInterest() {
        System.out.println("Interest calculation not applicable for Checking Account.");
    }

    @Override
    public void withdraw(double cashWithdrawalAmount) {
        double balance = getBalance();
        double remainingBalance = balance - cashWithdrawalAmount;

        if (remainingBalance < -overdraftLimit) {
            System.out.println("The limit is exceeded....");
            return;
        }

        setBalance(remainingBalance);

        if (remainingBalance == 0) {
            System.out.println("Your account balance is now : " + remainingBalance);
            System.out.println("Your overdraft limit is total : " + overdraftLimit);
        } else if (remainingBalance < 0) {
            System.out.println("You are using overdraft. Your balance is now: " + remainingBalance);


            double remainingOverdraftLimit = overdraftLimit + remainingBalance;
            setOverdraftLimit(remainingOverdraftLimit);
            System.out.println("Remaining overdraft limit: " + remainingOverdraftLimit);


            if (remainingOverdraftLimit == 0) {
                System.out.println("Your overdraft limit is now fully used and is 0.");
            }
        } else {
            System.out.println("Your new account balance is: " + remainingBalance);
        }
    }


}












//        double limit = overdraftLimit - overdraftLimit - overdraftLimit;
//        System.out.println("the limit is :"+limit);
//        if(getBalance() <= limit){
//            System.out.println("the Limit is exceeded.....");
//        }
//        setBalance(getBalance() - cashWithdrawalAmount);
//        if(getBalance() == getBalance()){
//
//        }
//        if (getBalance() == 0) {
//            System.out.println("your overdraftLimit is equal to : " + overdraftLimit);
//        } else if (overdraftLimit - overdraftLimit - overdraftLimit == getBalance()) {
//            System.out.println("your overdraftLimit is equal to" + cashWithdrawalAmount);
//        }
//    }
