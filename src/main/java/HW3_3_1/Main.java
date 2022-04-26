package HW3_3_1;

/**
 * @author Dm.Petrov
 * DATE: 18.04.2022
 */
public class Main {
    public static void main(String[] args) {
        LibrarianEmployee librarianEmployee = new LibrarianEmployee("Ivan");
        Reader reader = new Reader("Semen");
        Reader reader2 = new Reader("Taras");
        UserAdministrator userAdministrator = new UserAdministrator("Mark");
        UserSupplier userSupplier = new UserSupplier("Petr");
        librarianEmployee.orderBook(userSupplier);
        userSupplier.takeABook(userAdministrator);
        userAdministrator.overdueNotification(reader);
        reader2.returnBook(librarianEmployee);
    }
}
