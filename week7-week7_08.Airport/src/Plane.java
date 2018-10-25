
import java.util.HashMap;
import java.util.Map;

public class Plane {

    private HashMap<String, String> plane;

    public Plane() {
        this.plane = new HashMap<String, String>();
    }

    public void addplane(String id, String capacity) {
        this.plane.put(id, capacity);
    }

    public String toString() {
        String buffer = "";
        for (String i : this.plane.keySet()) {
            buffer += i + " (" + this.plane.get(i) + " ppl)\n";
        }
        return buffer;
    }

    public String get(String planeID) {
        return planeID + " (" + this.plane.get(planeID) + " ppl)";
    }

}
