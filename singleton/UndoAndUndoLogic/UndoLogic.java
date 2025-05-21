package singleton.UndoAndUndoLogic;

import static singleton.DemoApp.StartApp.input;

public class UndoLogic {
    public Undo undo = Undo.getInstance();
    public String order;// = new Undo();

    public void addOrder () {
        System.out.println("Ingrese una orden");
        order = input.next();
        undo.addToHistory(order);
    }

    public void deleteOrder () {
        if (undo.getHistory().isEmpty()){
            throw new IllegalStateException("No hay nada que borrar");
        }
        System.out.println("Ingrese una orden para borrar");
        order = input.next();

        if (!undo.getHistory().contains(order)) {
            System.out.println("La orden no existe");
        }
        undo.removeFromHistory(order);
    }

    public void showOrders () {
        System.out.println("Historial de ordenes");
        for (String order : undo.getHistory()) {
            System.out.println(order);
        }
    }
}
