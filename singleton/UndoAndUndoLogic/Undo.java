package singleton.UndoAndUndoLogic;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo undoInstance;
    private final List<String> history = new ArrayList<>();

    private Undo() { }

    public static synchronized Undo getInstance(){
        if(undoInstance == null){
            undoInstance = new Undo();
        }
        return undoInstance;
    }
    public synchronized void addToHistory(String order) {
        history.add(order);
    }
    public synchronized void removeFromHistory(String order) {
        history.remove(order);
    }
    public List<String> getHistory() {
        return new ArrayList<>(history);
    }


}
