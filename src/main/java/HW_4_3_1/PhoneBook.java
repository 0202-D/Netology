package HW_4_3_1;

import java.util.*;

/**
 * @author Dm.Petrov
 * DATE: 10.05.2022
 */
public class PhoneBook {
    private Map<String, Set<Contact>> phoneBook = new HashMap<>();

    public String createGroupContact(String group) {
        phoneBook.put(group, new HashSet<>());
        return group;
    }

    public Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    public void addContact(String group, Contact contact) {
        if (phoneBook.containsKey(group)) {
            if (phoneBook.get(group).contains(contact)) {
                System.out.println("Такой контакт уже есть");
            }
            phoneBook.get(group).add(contact);
        } else {
            phoneBook.get(createGroupContact(group)).add(contact);
        }
    }

    public Map<String, Set<Contact>> getPhoneBook() {
        return phoneBook;
    }

    public Set<Contact> searchContactByGroup(String group) {
        return phoneBook.get(group);
    }

    public Contact searchContactByPhoneNumber(String number) {
        for (Set<Contact> value : phoneBook.values()) {
            for (Contact contact : value) {
                if (contact.getPhoneNumber().equals(number))
                    return contact;
            }
        }
        return null;
    }

}

