package HW3_3_1;

/**
 * @author Dm.Petrov
 * DATE: 18.04.2022
 */
public class Reader extends User implements Reading {
    public Reader(String name) {
        super(name);
    }

    @Override
    public void takeABook(Administrator administrator) {
        System.out.println(this.getName() + " Взял книгу Чапаев и Пустота у " + administrator);
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println(this.getName() + " Вернул книгу Автостопом по галактике " + administrator);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
