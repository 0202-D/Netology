package HW3_3_1;

/**
 * @author Dm.Petrov
 * DATE: 18.04.2022
 */
public class UserSupplier extends Reader implements Supplier {
    public UserSupplier(String name) {
        super(name);
    }

    @Override
    public void bringBook(Librarian librarian) {
        System.out.println(this.getName() + " Доставил книгу Бойцовский клуб " + librarian);

    }

    @Override
    public String toString() {
        return this.getName();
    }
}
