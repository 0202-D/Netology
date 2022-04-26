package HW3_3_1;

/**
 * @author Dm.Petrov
 * DATE: 18.04.2022
 */
public abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
