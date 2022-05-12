package HW_4_3_1;

import java.util.Map;
import java.util.Set;

/**
 * @author Dm.Petrov
 * DATE: 10.05.2022
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.createGroupContact("Friends");
        Contact ivanContact = phoneBook.createContact("Ivan", "892164564656");
        Contact mariaContact = phoneBook.createContact("Maria", "89217777777");
        Contact mariaContact2 = phoneBook.createContact("Maria", "89217777777");
        Contact myMom = phoneBook.createContact("Mom", "5555555");
        Contact myDad = phoneBook.createContact("Dad", "8888888");
        Contact mark = phoneBook.createContact("Mark", "89213333333");
        phoneBook.addContact("Friends", ivanContact);
        phoneBook.addContact("Friends", mariaContact);
        phoneBook.addContact("Friends",mark);
        phoneBook.addContact("Home", myMom);
        phoneBook.addContact("Home", myDad);
        phoneBook.addContact("Friends", mariaContact2);
        for (Map.Entry<String, Set<Contact>> entry : phoneBook.getPhoneBook().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(phoneBook.searchContactByGroup("Friends"));
        System.out.println(phoneBook.searchContactByPhoneNumber("5555555"));
        System.out.println(phoneBook.searchContactByPhoneNumber("89213333333"));
        System.out.println("*********");
        MissedCallsBook missedCallsBook = new MissedCallsBook();
        missedCallsBook.addCall("5573737");
        Thread.sleep(5000);
        missedCallsBook.addCall("89213333333");
        Thread.sleep(1000);
        missedCallsBook.addCall("6666666");
        missedCallsBook.printMissedCalls(phoneBook);
    }
}
