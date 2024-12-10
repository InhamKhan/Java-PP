package BankingManagementSystem;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Bank {
//Account is return type this is datatype
    //(parameters as a input lye rhy han ham yah pay)

    ArrayList<Account> accounts = new ArrayList<>();

//    public void addNewCheckingAccount(String accountHolderName, double balance, int accountNumber, double overdraftLimit){
//        accounts.add(new CheckingAccount(accountHolderName , balance, accountNumber, overdraftLimit));
//        System.out.println("checking account added successfully...");
//    }
    //saving account.
    //returning the object of saving account
    public void addSavingAccount(String accountHolderName, double balance, int accountNumber, double minimumBalance){
        accounts.add(new SavingAccount(accountHolderName, balance, accountNumber, minimumBalance));
        System.out.println("saving account added successfully...");
    }
    public void printAccounts(){
        for (Account acc : accounts) {

            System.out.println(acc.getAccountHolderName()+" "+acc.getAccountNumber()+" "+acc.getBalance()+" " );
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
//
//                bank.addSavingAccount("SaadKhan",10900, 015, 50000);
//        bank.addSavingAccount("Hammad Khan",10900, 012, 50000);
//        bank.addSavingAccount("Shahid Khan",10900, 011, 50000);

//        bank.addNewCheckingAccount("Ali Raza", 10983, 010, 40000);
//        bank.addNewCheckingAccount("Raza", 10983, 01, 40000);
//        bank.addNewCheckingAccount("Raza Hassan", 10983, 014, 40000);

        bank.printAccounts();

//        bank.accounts.get(0).withdraw(2000);
       CheckingAccount checkingAccount  = new CheckingAccount("Hafiz Imran", 5000, 017, 200);

        checkingAccount.withdraw(200);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(5100);
        System.out.println(checkingAccount.getBalance());
        System.out.println(checkingAccount.overdraftLimit);
       checkingAccount.withdraw(200);
      System.out.println(checkingAccount.getBalance());

      System.out.println(checkingAccount.overdraftLimit);

        //        bank.accounts.get(1).getAccountNumber().;

    }
}

/*
*
        // System.out.println(bank.addSum(5,5));
//                ArrayList<Account> list = new ArrayList<>();
//                Account savingAccount1 = new SavingAccount("HamzaAli", 9955, 032, 6500);
              //  bank.addNewCheckingAccount("HamzaKhan", 10955, 013, 50000);
                //System.out.println("Checking the Account: " +  bank.accounts.get(0).getAccountHolderName());
                //System.out.println("Checking the Account : " + bank.accounts.get(0).getAccountNumber());

* */
        //System.out.println("Checking the Saving Accounts : " + bank.accounts.get(1).getAccountHolderName());
                //System.out.println("Checking the Saving Accounts : " + bank.accounts.get(1).getAccountNumber());


                //                Account obj = bank.addSavingAccount("HassanAhmed", 10955, 013, 9032.4);
                // list.add(savingAccount1);
                //multiple object we have made in it\
                //        list.addAccount();

//            }
//}
//
//
//
//                Bank2 variableObject = new Bank2();
//                Bank2 newbank = new Bank2();
//
//
//                Bank2.createNewAccount();
//
//
//
//                int number = sum(9,10);
//
//
//
////                addAccount();
////                listAccount();
////                calculateInterest();
//            }
//
//            public static int sum(int a, int b){
////                int sum = a+b;
//                return a+b;
//            }
//
//}
//
//class Bank2{
//
//    private String name ;
//    //array fixed size
//
//    private final ArrayList<CheckingAccount> checkingAccounts = new ArrayList<CheckingAccount>();
//    private final ArrayList<SavingAccount> savingAccounts = new ArrayList<SavingAccount>();
//
//    //public is an access modifier
//    //void is a return type. can be int, string,etc
//    //static
//    public void createNewAccount(){
//
//
//    }
//
//
//}