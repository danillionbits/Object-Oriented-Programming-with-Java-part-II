/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Dat Pham
 */
public class Thermometer implements Sensor {

    private boolean state;

    public Thermometer() {
        this.state = false;
    }

    public boolean isOn() {
        return this.state;
    }

    public void on() {
        this.state = true;
    }

    public void off() {
        this.state = false;
    }

    public int measure() {
        Random random = new Random();
        if (this.state) {
            return random.nextInt(30 - (-30) + 1) + (-30);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
