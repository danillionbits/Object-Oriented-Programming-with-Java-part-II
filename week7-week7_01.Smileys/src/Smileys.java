
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        int a = characterString.length();
        if (a % 2 == 1) {
            for (int i = 0; i < a + 7; i += 2) {
                System.out.print(":)");
            }
            System.out.println("");

            System.out.println(":) " + characterString + "  :)");
            for (int i = 0; i < a + 7; i += 2) {
                System.out.print(":)");
            }
            System.out.println("");
        } else {
            for (int i = 0; i < a + 6; i += 2) {
                System.out.print(":)");
            }
            System.out.println("");

            System.out.println(":) " + characterString + " :)");
            for (int i = 0; i < a + 6; i += 2) {
                System.out.print(":)");
            }
            System.out.println("");
        }
    }
}
