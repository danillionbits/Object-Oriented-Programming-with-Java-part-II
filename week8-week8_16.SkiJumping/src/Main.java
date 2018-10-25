
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        TUI ui = new TUI(reader);
        ui.start();

    }
}
