/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Dat Pham
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> dict;

    public PersonalMultipleEntryDictionary() {
        this.dict = new HashMap<String, Set<String>>();
    }

    public void add(String word, String translation) {
        if (!this.dict.containsKey(word)) {
            this.dict.put(word, new HashSet<String>());
        }
        this.dict.get(word).add(translation);
    }

    public Set<String> translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else {
            return null;
        }
    }

    public void remove(String word) {
        if (this.dict.containsKey(word)) {
            this.dict.remove(word);
        }
    }

}
