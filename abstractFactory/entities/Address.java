package abstractFactory.entities;

import abstractFactory.interfaces.AddressInterface;

public class Address implements AddressInterface {
    String streetName, streetNumber, city, postalCode;

    public Address (String streetName, String streetNumber, String city, String postalCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String addressFormat() {
        return this.streetName + " " + this.streetNumber + ", " + this.postalCode + ", " + this.city + ".";
    }

    public String toString() {
        return addressFormat();
    }
}
