/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dat Pham
 */
public class AverageSensor implements Sensor {

    private List<Sensor> db;
    private List<Integer> read;

    public AverageSensor() {
        this.db = new ArrayList<Sensor>();
        this.read = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        this.db.add(additional);
    }

    public boolean isOn() {
        boolean allOn = true;
        for (Sensor i : this.db) {
            if (!i.isOn()) {
                allOn = false;
                break;
            }
        }
        return allOn;
    }

    public void on() {
        for (Sensor i : this.db) {
            i.on();
        }
    }

    public void off() {
        for (Sensor i : this.db) {
            i.off();
        }
    }

    public int measure() {
        if (this.db.isEmpty() || this.isOn() == false) {
            throw new IllegalStateException();
        }
        int sum = 0;
        for (Sensor i : this.db) {
            sum += i.measure();
        }
        int measure = sum / this.db.size();
        this.read.add(measure);
        return measure;
    }

    public List<Integer> readings() {
        return this.read;
    }

}
