public class Account {

    private double balance;
    private String accountHolder;

    public Account(String accountHolder, double balance) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public double balance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountHolder='" + accountHolder + '\'' +
                '}';
    }
}
