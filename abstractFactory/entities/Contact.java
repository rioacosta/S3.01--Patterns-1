package abstractFactory.entities;

public class Contact {

        private final Address address;
        private final Telephone phoneNumber;
        private final String name;

        public Contact(String name, Address address, Telephone phoneNumber) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }
        public Contact(String name, Address address) {
            this(name, address, null);
        }
        public Contact(String name, Telephone phoneNumber) {
            this(name, null, phoneNumber);
        }

        @Override
        public String toString() {
            return "Nombre: " + name + ", " +
                    "Dirección: " + (address != null ? address : "No disponible") +
                    ", Teléfono: " + (phoneNumber != null ? phoneNumber : "No disponible");
        }

}
