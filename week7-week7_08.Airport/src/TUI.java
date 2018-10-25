
import java.util.Scanner;

public class TUI {

    private Scanner reader;
    private Plane plane;
    private Flight flight;

    public TUI(Scanner reader, Plane plane, Flight flight) {
        this.reader = reader;
        this.plane = plane;
        this.flight = flight;
    }

    public void start() {
        System.out.println("Airport panel\n-------------------\n");

        while (true) {
            System.out.println("Choose operation:\n [1] Add airplane \n [2] Add flight \n [x] Exit");
            System.out.print("> ");
            String command = this.reader.nextLine();
            if (command.equals("1")) {
                System.out.println("Give plane ID: ");
                String a = this.reader.nextLine();
                System.out.println("Give plane capacity: ");
                String b = this.reader.nextLine();
                this.plane.addplane(a, b);
            } else if (command.equals("2")) {
                System.out.println("Give plane ID: ");
                String id = this.reader.nextLine();
                System.out.println("Give departure airport code: ");
                String a = this.reader.nextLine();
                System.out.println("Give destination airport code: ");
                String b = this.reader.nextLine();

                String buffer2 = " (" + a + "-" + b + ")";
                this.flight.addflight(this.plane.get(id) + buffer2);
            } else if (command.equals("x")) {
                System.out.println("");
                break;
            }
        }

        System.out.println("Flight service\n-------------------\n");
        while (true) {
            System.out.println("Choose operation:\n [1] Print planes \n [2] Print flights \n [3] Print plane info \n [x] Quit");
            System.out.print("> ");
            String command = this.reader.nextLine();
            if (command.equals("1")) {
                System.out.println(this.plane);
            } else if (command.equals("2")) {
                System.out.println(this.flight);

            } else if (command.equals("3")) {
                System.out.println("Give plane ID: ");
                String id = this.reader.nextLine();
                System.out.println(this.plane.get(id));
            } else if (command.equals("x")) {
                break;
            }
        }
    }
}
