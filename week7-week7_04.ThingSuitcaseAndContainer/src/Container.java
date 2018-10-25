
import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> suitcase;
    private int limit;

    public Container(int maxweight) {
        this.suitcase = new ArrayList<Suitcase>();
        this.limit = maxweight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.limit >= (this.maxweight() + suitcase.totalWeight())) {
            this.suitcase.add(suitcase);
        }
    }

    public String toString() {
        return this.suitcase.size() + " suitcases (" + this.maxweight() + " kg)";
    }

    public int maxweight() {
        int buffer = 0;
        for (Suitcase i : this.suitcase) {
            buffer += i.totalWeight();
        }
        return buffer;
    }

    public void printThings() {
        for (Suitcase i : this.suitcase) {
            i.printThings();
        }
    }
}
