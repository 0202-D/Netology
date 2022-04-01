package ClassStructureLesson;

import java.util.ArrayList;

/**
 * @author Dm.Petrov
 * DATE: 29.03.2022
 */
public class Author {
    String name ;
    ArrayList<Book>list = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }
    public void writeBook(Book book){
        list.add(book);
    }

    @Override
    public String toString() {
        return "Автор "+name+" написал книги : "+list.toString();

    }
}
