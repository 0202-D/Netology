package HW_3_4_1;

import java.util.Scanner;

/**
 * @author Dm.Petrov
 * DATE: 21.04.2022
 */
public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        User u = getUserByLoginAndPassword(login, password);
        validateUser(u);
        System.out.println("Доступ предоставлен");
    }

    public static User[] getUsers() {
        User user1 = new User("John", "jhon@gmail.com", "pass", 24);
        User user2 = new User("Max", "madMax@gmail.com", "12345", 17);
        User user3 = new User("Julia", "babyJ@gmail.com", "girl777", 28);
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.name.equals(login) && user.pass.equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.age < 18) {
            throw new AccessDeniedException("Вам нет 18-лет!");
        }
    }
}

