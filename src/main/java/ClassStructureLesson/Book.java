package ClassStructureLesson;

/**
 * @author Dm.Petrov
 * DATE: 29.03.2022
 */
public class Book {
    public String genre;
    public String title;
    public int numberOfPages;

    public Book(String genre, String title, int numberOfPages) {
        this.genre = genre;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public void bookComparisons(Book b1) {
        if (this.numberOfPages == b1.numberOfPages) {
            System.out.println("Обьемы книг равны");
        } else if (this.numberOfPages > b1.numberOfPages) {
            System.out.println("Книга " + this.title + " больше обьемом чем книга "+b1.title);
        } else {
            System.out.println("Книга " + b1.title + " больше обьемом чем книга "+this.title);
        }
    }

    @Override
    public String toString() {
        return "Книга : " +
                "жанр - '" + genre + '\'' +
                ", название -'" + title + '\'' +
                ", количество страниц - " + numberOfPages + " страниц";

    }
}