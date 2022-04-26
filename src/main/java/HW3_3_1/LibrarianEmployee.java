package HW3_3_1;

/**
 * @author Dm.Petrov
 * DATE: 19.04.2022
 */
public class LibrarianEmployee extends UserAdministrator implements Librarian {

    public LibrarianEmployee(String name) {
        super(name);
    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println(this.getName() + " Заказал книги Пелевина у " + supplier);
    }
}
