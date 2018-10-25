/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dat Pham
 */
public class ContainerHistory {

    private List<Double> state = new ArrayList<Double>();

    public void add(double situation) {
        this.state.add(situation);
    }

    public void reset() {
        this.state.clear();
    }

    public String toString() {
        return this.state.toString();
    }

    public double maxValue() {
        if (this.state.isEmpty()) {
            return 0;
        } else {
            return Collections.max(this.state);
        }
    }

    public double minValue() {
        if (this.state.isEmpty()) {
            return 0;
        } else {
            return Collections.min(this.state);
        }
    }

    public double average() {
        if (this.state.isEmpty()) {
            return 0;
        } else {
            double sum = 0;
            for (double i : this.state) {
                sum += i;
            }
            return sum / this.state.size();
        }
    }

    public double greatestFluctuation() {
        double maxFlu = 0;
        if (this.state.isEmpty() || this.state.size() == 1) {
            return 0;
        } else {
            for (int i = 0; i < this.state.size() - 1; i++) {
                double buffer = Math.abs(this.state.get(i) - this.state.get(i + 1));
                if (buffer > maxFlu) {
                    maxFlu = buffer;
                }
            }
            return maxFlu;
        }
    }

    public double variance() {
        double average = average();
        double sum = 0;
        if (this.state.isEmpty() || this.state.size() == 1) {
            return 0;
        } else {
            for (double i : this.state) {
                sum += Math.pow((i - average), 2);
            }
            return sum / (this.state.size() - 1);
        }
    }
}
