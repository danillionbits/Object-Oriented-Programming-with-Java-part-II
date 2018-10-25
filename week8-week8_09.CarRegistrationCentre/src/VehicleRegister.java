
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> list;

    public VehicleRegister() {
        this.list = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!this.list.containsKey(plate)) {
            this.list.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(RegistrationPlate plate) {
        return this.list.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.list.containsKey(plate)) {
            this.list.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate i : this.list.keySet()) {
            System.out.println(i);
        }
    }

    public void printOwners() {
        ArrayList<String> buffer = new ArrayList<String>();
        //String owner = "";
        for (RegistrationPlate i : this.list.keySet()) {
            String owner = this.list.get(i);
            if (!buffer.contains(owner)) {
                buffer.add(owner);
            }
        }

        for (String j : buffer) {
            System.out.println(j);
        }
    }
}
