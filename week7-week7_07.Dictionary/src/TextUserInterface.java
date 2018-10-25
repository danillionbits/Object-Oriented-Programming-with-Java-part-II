
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dict = dictionary;
    }

    public void start() {
        System.out.println("Statement: ");
        System.out.println("  quit - quit the text user interface");
        while (true) {
            System.out.print("Statement: ");

            String command = this.reader.nextLine();
            if (command.equals("help")) {
                System.out.println("Unknown statement");
            } else if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("add")) {
                System.out.print("In Finnish: ");
                String a = this.reader.nextLine();
                System.out.print("Translation: ");
                String b = this.reader.nextLine();
                this.dict.add(a, b);
            } else if (command.equals("translate")) {
                System.out.print("Give a word: ");
                String a = this.reader.nextLine();
                System.out.println("Translation: " + this.dict.translate(a));
            }
        }
    }

}
