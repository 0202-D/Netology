package HW3_3_2;

/**
 * @author Dm.Petrov
 * DATE: 20.04.2022
 */
public class CreditAccount extends Account {

    @Override
    public boolean pay(int amount) {
        if (amount < 0) {
            System.out.println("Ошибка операции");
            return false;
        }
        setBalance(getBalance() - amount);
        return true;
    }

    @Override
    public void transfer(Account account, int amount) {
        boolean checkOperation;
        checkOperation = account.addMoney(amount);
        if (checkOperation) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Ошибка операции");
        }
    }

    @Override
    public boolean addMoney(int amount) {
        if (amount < 0) {
            System.out.println("Ошибка операции!");
            return false;
        }
        if (getBalance() + amount <= 0) {
            setBalance(getBalance() + amount);
            return true;
        } else {
            System.out.println("Вы можете пополнить кредитный счет максимально на " + Math.abs(getBalance()));
            return false;
        }
    }

    public void printBalance() {
        System.out.println("На вашем кредитном счете : " + getBalance());
    }
}
