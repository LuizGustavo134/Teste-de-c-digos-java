package BankExercise.entities;

public class account {
    private String  holder;
    private int number;
    private double balance = 0;

    public account() {
    }

    public account(String holder, double initialDeposit, int number) {
        this.number= number;
        this.holder = holder;
        deposit(initialDeposit);

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
