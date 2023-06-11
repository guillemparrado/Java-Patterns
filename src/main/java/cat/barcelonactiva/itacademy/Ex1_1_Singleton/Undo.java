package cat.barcelonactiva.itacademy.Ex1_1_Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Undo {
    static private  Undo instance;
    private final Stack<String> history = new Stack<>();

    static public Undo getInstance() {
        instance = instance == null ? new Undo() : instance;
        return instance;
    }

    private Undo(){}

    public void addCommand(String command) {
        history.push(command);
        System.out.println("Added command: " + command);
    }
    public void deleteCommand(){
        System.out.println("Deleted command: " + history.pop());
    }

    public List<String> getHistory() {
        return new ArrayList<String>(history);
    }
}
