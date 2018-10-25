
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Storehouse {

    private Map<String, Integer> pprice = new HashMap<String, Integer>();
    private Map<String, Integer> pstock = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.pprice.put(product, price);
        this.pstock.put(product, stock);
    }

    public int price(String product) {
        if (this.pprice.containsKey(product)) {
            return this.pprice.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (this.pstock.containsKey(product)) {
            return this.pstock.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        int buffer = 0;
        if (this.pstock.containsKey(product)) {
            buffer = this.pstock.get(product);
            if (buffer > 0) {
                buffer--;
                this.pstock.replace(product, buffer);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        Set<String> buffer = new HashSet<String>();
        for (String i : this.pprice.keySet()) {
            buffer.add(i);
        }
        return buffer;
    }
}
