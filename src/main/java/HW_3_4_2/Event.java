package HW_3_4_2;

/**
 * @author Dm.Petrov
 * DATE: 21.04.2022
 */
public abstract class Event {
    String title;
    int releaseAge;
    int age;

    public Event(String title, int releaseAge, int age) {
        this.title = title;
        this.releaseAge = releaseAge;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", releaseAge='" + releaseAge + '\'' +
                ", age=" + age +
                '}';
    }
}
