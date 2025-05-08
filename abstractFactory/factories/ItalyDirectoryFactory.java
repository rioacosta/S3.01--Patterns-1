package abstractFactory.factories;

import abstractFactory.entities.Telephone;
import abstractFactory.interfaces.DirectoryFactory;

public class ItalyDirectoryFactory implements DirectoryFactory {
    public String number, address;

    public ItalyDirectoryFactory() {
       }
    @Override
    public Telephone createTelephone(String number) {
        return new Telephone("+39 ", number);
    }

}
