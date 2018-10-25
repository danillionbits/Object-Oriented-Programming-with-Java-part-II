/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Dat Pham
 */
public class ConstantSensor implements Sensor {

    private int para;

    public ConstantSensor(int para) {
        this.para = para;
    }

    public int measure() {
        return this.para;
    }

    public boolean isOn() {
        return true;
    }

    public void on() {
    }

    public void off() {
    }
}
