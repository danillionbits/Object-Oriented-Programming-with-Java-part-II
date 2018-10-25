package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private final File file;

    private Scanner readFile() {
        try {
            Scanner reader = new Scanner(this.file, "UTF-8");
            return reader;
        } catch (Exception e) {
            return null;
        }
    }

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() throws Exception {
        int count = 0;
        Scanner reader = readFile();
        while (reader.hasNextLine()) {
            String s = reader.nextLine();
            count++;
        }
        return count;
    }

    public List<String> wordsContainingZ() throws Exception {
        ArrayList<String> wordz = new ArrayList<String>();

        String buffer = "";
        Scanner reader = readFile();

        while (reader.hasNextLine()) {
            buffer = reader.nextLine();
            if (buffer.contains("z")) {
                wordz.add(buffer);
            }
        }

        return wordz;
    }

    public List<String> wordsEndingInL() throws Exception {
        ArrayList<String> wordl = new ArrayList<String>();

        String buffer = "";
        Scanner reader = readFile();
        while (reader.hasNextLine()) {
            buffer = reader.nextLine();
            int a = buffer.length() - 1;
            if (buffer.endsWith("l")) {
                wordl.add(buffer);
            }
        }
        return wordl;
    }

    public List<String> palindromes() throws Exception {
        ArrayList<String> pali = new ArrayList<String>();

        String buffer = "";
        Scanner reader = readFile();
        while (reader.hasNextLine()) {
            buffer = reader.nextLine();
            String buffer1 = "";
            for (int i = buffer.length(); i > 0; i--) {
                buffer1 += buffer.charAt(i - 1);
            }
            if (buffer.equalsIgnoreCase(buffer1)) {
                pali.add(buffer);
            }
        }
        return pali;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception {
        ArrayList<String> vowel = new ArrayList<String>();

        String buffer = "";
        Scanner reader = readFile();
        while (reader.hasNextLine()) {
            buffer = reader.nextLine();
            if (buffer.contains("a") && buffer.contains("e") && buffer.contains("i") && buffer.contains("o") && buffer.contains("u") && buffer.contains("y") && buffer.contains("ä") && buffer.contains("ö")) {
                vowel.add(buffer);
            }
        }
        return vowel;
    }
}
