package HW_4_3_1;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Dm.Petrov
 * DATE: 12.05.2022
 */
public class MissedCallsBook {
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addCall(String number) {
        missedCalls.put(LocalDateTime.now(), number);
    }

    public void printMissedCalls(PhoneBook book) {
        for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
            if (book.searchContactByPhoneNumber(entry.getValue()) != null) {
                System.out.println("Вам звонил : " + book.searchContactByPhoneNumber(entry.getValue()).getName()
                        + " *** " + entry.getKey());
            } else {
                System.out.println("ВАм звонил : " + entry.getValue() + " *** " + entry.getKey());
            }

        }
    }
}
