
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Dictionary {

    private HashMap<String, String> dict;

    public Dictionary() {
        this.dict = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        this.dict.put(word, translation);
    }

    public String translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else {
            return null;
        }
    }
    
    public int amountOfWords(){
        return this.dict.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();
        for(String i:this.dict.keySet()){
            list.add(i + " = " + this.dict.get(i));
        }
        return list;
    }
    
}
