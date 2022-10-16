public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = Math.max(balance,0);
    }


    public String getOwner(){
        return this.owner;
    }

    public double getBalance(){
        return this.balance;
    }

    public void withdraw(double money){
        if (money <= this.balance){
            this.balance -= money;
        }
    }
    public void deposit(double money){
        if (money > 0){
            this.balance += money;
        }

    }

}

//using Encapsulation to implement the bankAccount class.
