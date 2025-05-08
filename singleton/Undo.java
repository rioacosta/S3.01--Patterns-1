package singleton;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    public static volatile Undo undoInstance;
    public List<String> history;
    public String order;

    private Undo() {
        history = new ArrayList<>();
    }

    public static Undo instantiator() {
        if (undoInstance == null) {
            synchronized (Undo.class) {
                if (undoInstance == null) {
                    undoInstance = new Undo();
                }
            }
        }
        return undoInstance;
    }

    public List<String> getHistory() {
        return history;
    }

    public void addOrder () {
        System.out.println("Ingrese una orden");
        order = Main.input.next();
        getHistory().add(order);
    }

    public void deleteOrder () {
        if (getHistory().isEmpty()){
            throw new IllegalStateException("No hay nada que borrar");
        }

        System.out.println("Ingrese una orden para borrar");
        order = Main.input.next();

        if (!getHistory().contains(order)) {
            System.out.println("La orden no existe");
        }

        getHistory().remove(order);
    }

    public void showOrders () {
        System.out.println("Historial de ordenes");
        for (String order : getHistory()) {
            System.out.println(order);
        }
    }
}
