package singleton;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Undo undo = Undo.instantiator();
        int option;

        do {
            System.out.println("""
                    Elige la una opción  \n
                    1.Introducir una orden \n
                    2.Eliminar una orden \n
                    3.Mostrar las ordenes \n
                    4.Salir\
                    """);
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1 -> undo.addOrder();

                case 2 -> undo.deleteOrder();

                case 3 -> undo.showOrders();

                case 4 -> System.out.println("Saliendo");

                default -> System.out.println("ingrese un numero valido del 1 al 4");

            }
            System.out.println();
        } while (option != 4);
    }
}
