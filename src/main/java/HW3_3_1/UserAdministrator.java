package HW3_3_1;

/**
 * @author Dm.Petrov
 * DATE: 18.04.2022
 */
public class UserAdministrator extends User implements Administrator {
    public UserAdministrator(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reading reading) {
        System.out.println(reading + " Просрочил книгу Братья Карамазовы");
    }

    @Override
    public void findAndIssue(Reading reading) {
        System.out.println(this.getName() + " Нашел и выдал книгу Snuff " + reading);

    }

    @Override
    public String toString() {
        return this.getName();
    }
}
