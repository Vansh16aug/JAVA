class Account{
    private String accountNumber;
    private double balance;

    Account(String accountNumber,double intialBalance){
        this.accountNumber = accountNumber;
        this.balance = intialBalance;
    }

    void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposited : " + amount );
        displayBalance();
    }

    void withdraw(double amount){
        if (amount<=balance){
            this.balance-=amount;
            System.out.println("Withdrawl Succesfull");
            displayBalance();
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

    void calculatedInterest(){
        double interest;
        interest = this.balance * 5 /100;
        System.out.println(" Interest Accumulated " + interest);
    }
    void displayBalance(){
        System.out.println("Account Number : " + this.accountNumber + " Balance : " + this.balance);
    }
}
public class ProblemDemo {
    public static void main(String[] args) {
        Account a = new Account("ABC123",1000);
        Account b = new Account("DEF456",2000);

        a.displayBalance();
        a.deposit(1000);
        a.withdraw(1500);
        a.withdraw(1000);
        b.displayBalance();
        b.calculatedInterest();
    }
}

