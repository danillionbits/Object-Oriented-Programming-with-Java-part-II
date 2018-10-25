
import java.io.File;
import java.util.Scanner;

public class Printer {

    private String fname;

    public Printer(String fileName) {
        this.fname = fileName;
    }

    public void printLinesWhichContain(String word) throws Exception {
        File f = new File(this.fname);
        Scanner reader = new Scanner(f);

        String buffer = "";
        String line = "";

        while (reader.hasNextLine()) {
            line = reader.nextLine();
            if (line.contains(word)) {
                buffer += line;
                buffer += "\n";
                System.out.println(line);
            }
        }
    }
}
