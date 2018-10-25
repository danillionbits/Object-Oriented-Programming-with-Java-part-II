
import java.util.ArrayList;

public class Box implements ToBeStored {

    private double maxweight;
    private ArrayList<ToBeStored> box;

    public Box(double maxweight) {
        this.maxweight = maxweight;
        this.box = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored item) {
        if (this.maxweight >= (this.weight() + item.weight())) {
            this.box.add(item);
        }
    }

    public double weight() {
        double weight = 0;
        
        for (ToBeStored item : this.box) {
            weight = weight + item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.box.size() + " things, total weight " + this.weight() + " kg";
    }

}
