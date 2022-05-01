package HW_3_4_2;

/**
 * @author Dm.Petrov
 * DATE: 21.04.2022
 */
public class Main {
    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Matrix", 1997, 18),
                new Movie(null, 2022, 16)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Идиот", 2022, 16)
        };
    }

    public static void validEvent(Event event) {

        if (event.releaseAge == 0 || event.title == null || event.age == 0) {
            System.out.println("Ошибка в данных события :" + event);
            throw new NullPointerException("Событие не корректно");

        }
    }
}

