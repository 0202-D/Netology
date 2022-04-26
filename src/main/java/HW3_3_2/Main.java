package HW3_3_2;

/**
 * @author Dm.Petrov
 * DATE: 19.04.2022
 */
public class Main {
    public static void main(String[] args) {

        Account savingAccount = new SavingAccount();
        Account creditAccount = new CreditAccount();
        Account checkingAccount = new CheckingAccount();
        savingAccount.addMoney(1000);
        savingAccount.transfer(creditAccount, 200);
        savingAccount.printBalance();
        savingAccount.transfer(checkingAccount, 300);
        checkingAccount.printBalance();
        checkingAccount.transfer(creditAccount, 200);
        checkingAccount.printBalance();
        creditAccount.printBalance();
        creditAccount.pay(500);
        creditAccount.printBalance();
        checkingAccount.transfer(creditAccount, 250);
        creditAccount.printBalance();
        savingAccount.printBalance();
        checkingAccount.printBalance();
        savingAccount.pay(10000);
        checkingAccount.pay(200);
        checkingAccount.pay(-100);

    }
}
