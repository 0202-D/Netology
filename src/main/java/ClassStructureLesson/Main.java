package ClassStructureLesson;

/**
 * @author Dm.Petrov
 * DATE: 29.03.2022
 */
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("роман","Идиот",625);
        Book b2 = new Book("мистика","Мастер и Маргарита",1525);
        Book b3 = new Book("драма","Братья Карамазовы",400);
        b1.bookComparisons(b2);
        Author author = new Author("Ф.М.Достоевский");
        author.writeBook(b1);
        author.writeBook(b3);
        System.out.println(author);
        User user = new User("James","Gosling","uncleJames@gmail.com");
        User user2 = new User("Linus","Torvalds","i'mTheBest@gmail.com");
        User user3 = new User("Corey","Taylor","slipknot@gmail.com");
        System.out.println("Пользователей онлайн - "+User.totalOnline);
    }
}
