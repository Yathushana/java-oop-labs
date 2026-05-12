package Week03.Question01;

class SavingsAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;
    SavingsAccount(String accountNumber,
                   String accountHolderName,
                   double balance){

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){

        if(amount > 0){

            balance = balance + amount;

            System.out.println("Deposit Successful");
        }
        else{
            System.out.println("Invalid Deposit Amount");
        }
    }
    public void withdraw(double amount){

        if(amount <= balance){

            balance = balance - amount;

            System.out.println("Withdrawal Successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccountDetails(){

        System.out.println("Account Number: " + accountNumber);

        System.out.println("Account Holder Name: "
                + accountHolderName);

        System.out.println("Balance: " + balance);
    }
}

public class SavingAccount {

    public static void main(String[] args) {

        SavingsAccount s1 =
                new SavingsAccount("ACC101",
                        "Jathu",
                        5000);

        s1.deposit(2000);

        s1.withdraw(1000);

        s1.displayAccountDetails();
    }
}

