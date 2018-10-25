/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Dat Pham
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private List<String> db;
    private int count;

    public PersonalDuplicateRemover() {
        this.db = new ArrayList<String>();
        this.count = 0;
    }

    public void add(String characterString) {
        if (this.db.contains(characterString)) {
            this.count++;
        }
        this.db.add(characterString);
    }

    public int getNumberOfDetectedDuplicates() {
        return this.count;
    }

    public Set<String> getUniqueCharacterStrings() {
        Set<String> unique = new HashSet<String>();
        for (String i : this.db) {
            if (!unique.contains(i)) {
                unique.add(i);
            }
        }
        return unique;
    }

    public void empty() {
        this.db.removeAll(db);
        this.count = 0;
    }

}
