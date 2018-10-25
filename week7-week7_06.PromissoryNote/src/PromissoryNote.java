
import java.util.HashMap;
import java.util.Map;

public class PromissoryNote {

    private HashMap<String, Double> note;

    public PromissoryNote() {
        this.note = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        this.note.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (this.note.containsKey(whose)) {
            return this.note.get(whose);
        } else {
            return 0;
        }
    }
}
