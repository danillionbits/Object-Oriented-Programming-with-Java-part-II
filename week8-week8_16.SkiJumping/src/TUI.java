
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TUI {

    private Scanner reader;
    private ArrayList<Person> db;

    public TUI(Scanner reader) {
        this.reader = reader;
        this.db = new ArrayList<Person>();
    }

    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String name = this.reader.nextLine();
            if (name.equals("")) {
                System.out.println("");
                break;
            } else {
                this.db.add(new Person(name, 0));
            }
        }

        System.out.println("The tournament begins!\n");

        int numb = 1;

        while (true) {
            Collections.sort(this.db);
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String input = this.reader.nextLine();

            if (input.equals("jump")) {
                System.out.println("Round " + numb + "\n");
                System.out.println("Jumping order:");

                int count = 1;
                for (Person i : this.db) {
                    System.out.println("  " + count + ". " + i);
                    count++;
                }

                System.out.println("Results of round " + numb);
                for (Person i : this.db) {
                    Score score = new Score(i);

                    System.out.println("  " + i.getName());
                    int a = score.getJumpLength();
                    i.addjumpscore(a);
                    System.out.println("    length: " + a);
                    System.out.print("    judge votes: ");
 
                    System.out.println(score.getJudgePoint());
                    i.addScore(score.totalScore());
                }
                numb++;

            } else {
                System.out.println("\nThanks!\n\nTournament results:\nPosition    Name");
                int buffer = 1;
                Collections.reverse(this.db);
                for (Person i : this.db) {
                    System.out.println(buffer + "           " + i);
                    buffer++;

                    System.out.print("            jump lengths: ");

                    int count = 1;
                    for (int j : i.getjumpscore()) {
                        if (count == i.getjumpscore().size()) {
                            System.out.print(j + " m");
                        } else {
                            System.out.print(j + " m, ");
                        }
                        count++;
                    }
                    System.out.println("");
                }
                break;
            }
        }
    }
}
