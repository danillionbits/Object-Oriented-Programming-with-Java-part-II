/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Dat Pham
 */
import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private final List<Movable> G_list = new ArrayList<Movable>();

    public void addToGroup(Movable movable) {
        this.G_list.add(movable);
    }

    @Override
    public String toString() {
        String group = "";
        for (Movable temp : this.G_list) {
            group += temp.toString();
            group += "\n";
        }
        return group;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable temp : this.G_list) {
            temp.move(dx, dy);
        }
    }
}
