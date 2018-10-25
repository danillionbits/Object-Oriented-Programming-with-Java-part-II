
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        for (Card i : this.hand) {
            System.out.println(i);
        }
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    public int compareTo(Hand other) {
        int sum1 = 0;
        int sum2 = 0;
        for (Card i : this.hand) {
            sum1 += i.getValue();
        }
        for (Card i : other.hand) {
            sum2 += i.getValue();
        }
        if (sum1 < sum2) {
            return -1;
        } else if (sum1 > sum2) {
            return 1;
        } else {
            return 0;
        }
    }

    public void sortAgainstSuit() {
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
}
