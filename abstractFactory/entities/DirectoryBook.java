package abstractFactory.entities;

import java.util.ArrayList;
import java.util.List;

public class DirectoryBook {
        private final List<Contact> contacts;

        public DirectoryBook() {
            this.contacts = new ArrayList<>();
        }

        public void addContact(String name, Address address, Telephone phoneNumber) {
           /* Telephone number = (phoneNumber != null) ? factory.createTelephone(phoneNumber) : null;*/
            Contact contact = new Contact(name, address, phoneNumber);
            contacts.add(contact);
        }

        public void addContact(String name, Address address) {
            contacts.add(new Contact(name, address));
        }

        public void addContact(String name, Telephone phoneNumber) {
            contacts.add(new Contact(name, phoneNumber));
        }

        public void printContacts() {
            System.out.println("Contactos:");
            contacts.forEach(System.out::println);
            System.out.println("-------------------------");
        }
    }
