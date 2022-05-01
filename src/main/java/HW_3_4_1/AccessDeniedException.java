package HW_3_4_1;

/**
 * @author Dm.Petrov
 * DATE: 21.04.2022
 */
public class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super("Доступ запрещен,Вам нет 18-ти лет");
    }
}
