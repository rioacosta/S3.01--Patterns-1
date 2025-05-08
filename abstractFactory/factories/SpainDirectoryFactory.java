package abstractFactory.factories;

import abstractFactory.entities.Telephone;
import abstractFactory.interfaces.DirectoryFactory;

public class SpainDirectoryFactory implements DirectoryFactory {
    public String number, address;

    public SpainDirectoryFactory() {
        /*this.number = number;
        this.address = address;*/
    }

    @Override
    public Telephone createTelephone(String number) {
        return new Telephone("+34 ", number);
    }
    /*@Override
    public Address createAddress(String streetName, String streetNumber, String city, String postalCode) {
        return new Address(streetName, streetNumber, city, postalCode);
    }
    @Override
    public String toString() {
        return "SpainDirectoryFactory{" +
                "number='" + number + '\'' +
                ", address='" + address + '\'' +
                '}';
    }*/
}
