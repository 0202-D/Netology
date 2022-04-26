package HW3_3_2;

/**
 * @author Dm.Petrov
 * DATE: 20.04.2022
 */
public class SavingAccount extends Account {

    @Override
    public boolean pay(int amount) {
        System.out.println("Операция оплаты не производится на сберегптельном счете");
        return false;
    }

    @Override
    public void transfer(Account account, int amount) {
        boolean checkOperation = false;
        if (amount <= this.getBalance()) {
            checkOperation = account.addMoney(amount);
        } else {
            System.out.println("У Вас недостаточно средств");
        }
        if (checkOperation) {
            this.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("Ошибка ! Операция не выпонена!");
        }
    }

    @Override
    public boolean addMoney(int amount) {
        if (amount > 0) {
            setBalance(amount + this.getBalance());
            return true;
        } else {
            System.out.println("Ошибка операции");
            return false;
        }
    }

    public void printBalance() {
        System.out.println("На вашем сберегательном счете : " + getBalance());
    }
}
