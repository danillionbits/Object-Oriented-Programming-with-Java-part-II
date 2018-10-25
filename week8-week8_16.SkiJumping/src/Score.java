
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Score {

    private final Random random = new Random();
    private int jumpLength;
    private List<Integer> judgepoint;

    public Score(Person person) {
        this.jumpLength = random.nextInt(120 - 60 + 1) + 60;
        this.judgepoint = new ArrayList<Integer>();
    }

    public int getJumpLength() {
        return this.jumpLength;
    }

    public List<Integer> getJudgePoint() {
        for (int i = 0; i < 5; i++) {
            this.judgepoint.add(random.nextInt(20 - 10 + 1) + 10);
        }
        return this.judgepoint;
    }

    public int totalScore() {
        removeSmallestandLargest(this.judgepoint);
        int total = this.jumpLength + sumJudgePoint(this.judgepoint);

        return total;
    }

    public int sumJudgePoint(List<Integer> score) {
        int sum = 0;
        for (int i : score) {
            sum += i;
        }
        return sum;
    }

    public void removeSmallestandLargest(List<Integer> score) {
        Collections.sort(score);
        score.remove(0);
        score.remove(score.size() - 1);
    }
}