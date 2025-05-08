package abstractFactory.interfaces;

import abstractFactory.entities.Address;
import abstractFactory.entities.Telephone;

import static abstractFactory.app.FactoryHandler.userInput;

public interface DirectoryFactory {

    default Address createAddress(){
        System.out.println("Ingrese el nombre de la calle");
        String streetName = userInput.next();
        System.out.println("Ingrese el numero de la calle");
        String streetNumber = userInput.next();
        System.out.println("Ingrese el código postal");
        String postalCode = userInput.next();
        System.out.println("Ingrese la ciudad");
        String city = userInput.next();
        return new Address(streetName, streetNumber, city, postalCode);
    }
    Telephone createTelephone(String number);
}
