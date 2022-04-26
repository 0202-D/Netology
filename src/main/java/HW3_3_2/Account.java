package HW3_3_2;

/**
 * @author Dm.Petrov
 * DATE: 20.04.2022
 */
public abstract class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    abstract public boolean pay(int amount);

    abstract public void transfer(Account account, int amount);

    abstract public boolean addMoney(int amount);

    abstract public void printBalance();

}
