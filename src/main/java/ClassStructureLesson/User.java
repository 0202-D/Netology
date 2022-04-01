package ClassStructureLesson;

/**
 * @author Dm.Petrov
 * DATE: 29.03.2022
 */
public class User {
    String name;
    String surName;
    String email;
    static long totalOnline;
    public User(String name, String surName, String email) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        totalOnline++;

    }
}
