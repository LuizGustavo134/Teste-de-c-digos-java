package BankExercise.entities;

public class Account {
    private String  holder;
    private int number;
    private double balance = 0;

    public Account() {
    }

    public Account(String holder, double initialDeposit, int number) {
        this.holder = holder;
        this.number= number;
        deposit(initialDeposit);

    }
    public Account(String holder, int number){
        this.number =number;
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Account Data: "
                + number
                +", holder: "
                +holder
                +", balance: "
                + String.format("%.2f",balance);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw( double amount){
        balance -= amount + 5.00;
    }
}
