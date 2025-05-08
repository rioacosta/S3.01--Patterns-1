package abstractFactory.factories;

import abstractFactory.entities.Telephone;
import abstractFactory.interfaces.DirectoryFactory;

public class UKDirectoryFactory implements DirectoryFactory {
    public String number, address;

    public UKDirectoryFactory() {
    }

    @Override
    public Telephone createTelephone(String number) {
        return new Telephone("+44 ", number);
    }

}

