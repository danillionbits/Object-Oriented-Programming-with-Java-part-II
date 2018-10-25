
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> name = new HashMap<String, String>();
        name.put("matti", "mage");
        name.put("mikael", "mixu");
        name.put("arto", "arppa");
        System.out.println(name.get("mikael"));
    }

}
