package abstractFactory.app;

import abstractFactory.entities.Address;
import abstractFactory.entities.DirectoryBook;
import abstractFactory.entities.Telephone;
import abstractFactory.factories.ItalyDirectoryFactory;
import abstractFactory.factories.SpainDirectoryFactory;
import abstractFactory.factories.UKDirectoryFactory;
import abstractFactory.interfaces.DirectoryFactory;

import java.util.Scanner;

public class FactoryHandler {

    public static Scanner userInput = new Scanner(System.in);
    private static final DirectoryBook directoryBook = new DirectoryBook();
    private static String name;
    private static DirectoryFactory newFactory;

    public static DirectoryFactory createFactory () {
        System.out.println("""
                        De que pais es el contacto?
                        -UK
                        -Spain
                        -Italy
                        """);
        String country = userInput.next();

          return switch (country.toLowerCase()) {
            case "spain" -> new SpainDirectoryFactory();
            case "uk" -> new UKDirectoryFactory();
            case "italy" -> new ItalyDirectoryFactory();
            default -> null;
        };
      }

    public static void addAndPrintNewContact () {
        int option;
        do { System.out.println("""
                      Deseas agregar un numero o una dirección?
                      marca '1' para numero
                      marca '2' para dirección
                      marca '3' para agregar ambos
                      marca '4' para ver los contactos existentes
                      marca '5' para Salir
                      """ );
             option = userInput.nextInt();
             userInput.nextLine();

           if (option == 5) {
               System.out.println("Saliendo... Adios!");
            return;
           }
           if (option == 4) {
               directoryBook.printContacts();
            continue;
           }

           newFactory = createFactory();

           if (newFactory == null) {
                System.out.println("País no incluido en el sistema, contacte con el administrador para agregar");
            continue;
           }

            switch (option) {
                case 1-> justTelephoneContact();
                case 2-> justAddressContact();
                case 3-> wholeInfoContact();
                default -> System.out.println("Opción no válida.");
            }

        } while (true);
    }


    public static String getTelephoneNumber() {
        String number;
        System.out.println("Ingrese el numero");
        number = userInput.next();
        return number;
    }
    public static String getContactName () {
        System.out.println("Como se llama el contacto?");
        name = userInput.next();
        return name;
    }
    public static void justTelephoneContact() {
        name = getContactName();
        Telephone telephoneNumber = newFactory.createTelephone(getTelephoneNumber());
        directoryBook.addContact(name, telephoneNumber);
    }
    public static void justAddressContact() {
        name = getContactName();
        Address address = newFactory.createAddress();
        directoryBook.addContact(name, address);
    }
    public static void wholeInfoContact() {
        name = getContactName();
        Address address = newFactory.createAddress();
        Telephone telephoneNumber = newFactory.createTelephone(getTelephoneNumber());
        directoryBook.addContact(name, address, telephoneNumber);
    }
    public static void start(){
         addAndPrintNewContact();
    }

}
