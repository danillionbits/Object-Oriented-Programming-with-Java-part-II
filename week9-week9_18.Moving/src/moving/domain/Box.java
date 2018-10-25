/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Dat Pham
 */
import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> db;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.db = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (this.maximumCapacity >= (this.getVolume() + thing.getVolume())) {
            this.db.add(thing);
            return true;
        } else {
            return false;
        }
    }

    public int getVolume() {
        int vol = 0;
        for (Thing i : this.db) {
            vol += i.getVolume();
        }
        return vol;
    }

}
