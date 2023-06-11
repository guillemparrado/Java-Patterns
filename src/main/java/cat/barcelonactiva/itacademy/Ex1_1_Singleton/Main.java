package cat.barcelonactiva.itacademy.Ex1_1_Singleton;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Undo undo = Undo.getInstance();
        undo.addCommand("Write 'Hello'");
        undo.addCommand("Write ' '");
        undo.addCommand("Write 'World'");
        undo.addCommand("Write '!'");

        undo = Undo.getInstance();
        undo.deleteCommand();
        undo.deleteCommand();
        undo.deleteCommand();

        undo = Undo.getInstance();
        undo.addCommand("Write '!'");

        System.out.println("~~FINAL HISTORY~~");
        for(String command : undo.getHistory())
            System.out.println(command);
    }
}
