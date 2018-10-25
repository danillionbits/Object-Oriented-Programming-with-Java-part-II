
import java.util.ArrayList;

public class Flight {

    private ArrayList<String> flight;

    public Flight() {
        this.flight = new ArrayList<String>();
    }

    public void addflight(String flight) {
        this.flight.add(flight);
    }

    public String toString() {
        String buffer = "";
        for (String i : this.flight) {
            buffer += i + "\n";
        }

        return buffer;
    }
}
