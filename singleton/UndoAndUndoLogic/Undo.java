package singleton.UndoAndUndoLogic;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    public static Undo undoInstance;
    public List<String> history;

    public Undo() {
        history = new ArrayList<>();
    }

    public synchronized static Undo getInstance(){
        if(undoInstance == null){
            undoInstance = new Undo();
        }
        return undoInstance;
    }

    public List<String> getHistory() {
        return history;
    }


}
