package HW3_3_2;

/**
 * @author Dm.Petrov
 * DATE: 20.04.2022
 */
public class CheckingAccount extends Account {

    @Override
    public boolean pay(int amount) {
        if (amount < 0) {
            System.out.println("Ошибка операции");
            return false;
        }
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            return true;
        } else {
            System.out.println("На Вашем расчетном счете не достаточно средств ! ");
            return false;
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        boolean checkOperation = false;
        if (amount <= getBalance()) {
            checkOperation = account.addMoney(amount);
        } else {
            System.out.println("Недостаточно средств");
        }
        if (checkOperation) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Ошибка в операции! Операция не выполнена!");
        }
    }

    @Override
    public boolean addMoney(int amount) {
        if (amount < 0) {
            System.out.println("Ошибка операции");
            return false;
        }
        setBalance(getBalance() + amount);
        return true;
    }

    public void printBalance() {
        System.out.println("На вашем расчетном счете : " + getBalance());
    }
}
