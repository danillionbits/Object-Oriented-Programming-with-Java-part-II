
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private int maxweight;

    public Suitcase(int maxweight) {
        this.things = new ArrayList<Thing>();
        this.maxweight = maxweight;
    }

    public void addThing(Thing thing) {
        if (this.maxweight >= (this.totalWeight() + thing.getWeight())) {
            this.things.add(thing);
        }
    }

    public int totalWeight() {
        int buffer = 0;
        for (Thing i : this.things) {
            buffer += i.getWeight();
        }
        return buffer;
    }

    public String toString() {
        if (this.things.size() == 0) {
            return "empty (" + this.totalWeight() + " kg)";

        } else if (this.things.size() == 1) {
            return this.things.size() + " thing (" + this.totalWeight() + " kg)";
        } else {
            return this.things.size() + " things (" + this.totalWeight() + " kg)";

        }
    }

    public void printThings() {
        for (Thing i : this.things) {
            System.out.println(i);
        }
    }

    public Thing heaviestThing() {
        if (this.things.size() > 0) {
            int heaviest = this.things.get(0).getWeight();
            for (Thing i : this.things) {
                if (i.getWeight() > heaviest) {
                    heaviest = i.getWeight();
                }
            }

            for (Thing i : this.things) {
                if (heaviest == i.getWeight()) {
                    return i;
                }
            }
        }
        return null;
    }
}
