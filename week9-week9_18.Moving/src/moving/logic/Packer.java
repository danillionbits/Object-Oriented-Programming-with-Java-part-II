package moving.logic;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import moving.domain.Box;
import moving.domain.Thing;
import moving.domain.Item;
import moving.domain.Thingcomparable;

public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> db = new ArrayList<Box>();

        Collections.sort(things, new Thingcomparable());
        Box box = new Box(this.boxesVolume);

        for (Thing i : things) {
            if (!box.addThing(i)) {
            //    System.out.println(i);
            //    db.add(box);
                System.out.println(box.getVolume());

            //    box = new Box(this.boxesVolume);
            }
            box.addThing(i);

        }
        System.out.println();
        return db;
    }
}
