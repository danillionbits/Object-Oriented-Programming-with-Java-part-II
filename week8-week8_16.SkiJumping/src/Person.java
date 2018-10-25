import java.util.List;
import java.util.ArrayList;

public class Person implements Comparable<Person> {

    private String name;
    private int score;
    private List<Integer> jumpscore;
    
    public Person(String name, int score) {
        this.name = name;
        this.score = 0;
        this.jumpscore = new ArrayList<Integer>();
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void addScore(int score) {
        this.score += score;
    }
    
    public void addjumpscore(int a){
        this.jumpscore.add(a);
    }
    
    public List<Integer >getjumpscore(){
        return this.jumpscore;
    }

    @Override
    public int compareTo(Person other) {
        if (this.score > other.score) {
            return 1;
        } else if (this.score < other.score) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return this.name + " (" + this.score + " points)";
    }
}
