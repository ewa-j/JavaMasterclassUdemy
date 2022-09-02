package lists;

import java.util.ArrayList;

public class MobilePhone {
  private String myNumber;
  private ArrayList<Contact> myContacts;

  public MobilePhone(String phoneNumber) {
    myNumber = phoneNumber;
    myContacts = new ArrayList<>();
  }

  public boolean addNewContact(Contact contact) {
    if(findContact(contact) >= 0) {
      return false;
    }
    myContacts.add(contact);
    return true;
  }

  public boolean updateContact(Contact oldContact, Contact newContact) {
    if(findContact(oldContact) < 0) {
      return false;
    }
    myContacts.set(myContacts.indexOf(oldContact), newContact);
    return true;
  }

  public boolean removeContact(Contact contact) {
    if(findContact(contact) < 0) {
      return false;
    }
    myContacts.remove(contact);
    return true;
  }

  private int findContact(Contact contact) {
    return findContact(contact.getName());
  }

  private int findContact(String name) {
    for(Contact inContacts : myContacts) {
      if(inContacts.getName().equalsIgnoreCase(name)) {
        return myContacts.indexOf(inContacts);
      }
    }
    return -1;
  }

  public Contact queryContact(String name) {
    return myContacts.get(findContact(new Contact(name, "")));
  }

  public void printContacts() {
    int position = 1;
    System.out.println("Contact List:");
    for(Contact contact : myContacts) {
      System.out.printf("%d. %s -> %s\n",position, contact.getName(), contact.getPhoneNumber());
      position++;
    }
  }
}