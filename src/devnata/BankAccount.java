package devnata;

public class BankAccount {
    private String owner;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public BankAccount(String owner,double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void withdrawBalance(double amount){
        if(balance < amount) {
            System.out.println("You don't have enough currency to withdraw this.");
        } else if (validityCheck(amount)) {
            balance = balance - amount;
            System.out.println("Hello " + this.owner + ", you have successfully withdrawn " + amount);
        }
    }

    public void depositBalance(double amount) {
        if (validityCheck(amount)) {
            balance = balance + amount;
            System.out.println("Hello " + this.owner + ", you have successfully deposited " + amount);
        }
    }

    public boolean validityCheck (double amount) {
        if (amount < 0) {
            System.out.println("A negative cannot be used in this operation.");
            return false;
        }
        if (amount == 0) {
            System.out.println("Zero cannot be used in this operation.");
            return false;
        }
        return true;
    }

    public void printAccounts(){
        System.out.println(this.owner + " | " + this.balance);
    }
}
