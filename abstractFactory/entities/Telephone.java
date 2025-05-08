package abstractFactory.entities;

public class Telephone {
    String number, countryCode;

    public Telephone (String prefix, String number) {
        this.number = number;
        this.countryCode = prefix;
    }

    public String telephoneFormat () {
        return countryCode + number;
    }

    @Override
    public String toString() {
        return telephoneFormat();
    }
}
