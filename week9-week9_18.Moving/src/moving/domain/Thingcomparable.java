/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.Comparator;

/**
 *
 * @author Dat Pham
 */
public class Thingcomparable implements Comparator<Thing> {

    @Override
    public int compare(Thing o1, Thing o2) {
        return o1.getVolume() - o2.getVolume();
    }
}
