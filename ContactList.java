import java.util.ArrayList;
import java.util.List;

public class ContactList {
    // List of type ContactDetails to get values from ContactDetails variables and set them in the list
    private static List<ContactDetails> contacts = new ArrayList<>();

    public static List<ContactDetails> getContacts() {
        return contacts;
    }
    public static void setContacts(List<ContactDetails> contacts) {
        ContactList.contacts = contacts;
    }
}
