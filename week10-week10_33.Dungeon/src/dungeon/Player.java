/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;

/**
 *
 * @author Dat Pham
 */
public class Player extends Character {

    public Player(String name, int length, int heigth) {
        super(name, length, heigth);
        this.x = 0;
        this.y = 0;
    }

    public void move(ArrayList<String> moves) {
        for (String m : moves) {
            if (m.equals("w") && y - 1 < heigth && y - 1 >= 0) {
                y -= 1;
            } else if (m.equals("s") && y + 1 < heigth && y + 1 >= 0) {
                y += 1;
            } else if (m.equals("a") && x - 1 < length && x - 1 >= 0) {
                x -= 1;
            } else if (m.equals("d") && x + 1 < length && x + 1 >= 0) {
                x += 1;
            }
        }
    }
}
