package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, Exception {
        // test your code here

        File file = new File("src/wordList.txt");
        // all words are in file src/wordList.txt
        WordInspection a = new WordInspection(file);
        System.out.println(a.wordsEndingInL());

    }
}
