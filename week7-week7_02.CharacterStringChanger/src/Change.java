
public class Change {

    private char a;
    private char b;

    public Change(char fromCharacter, char toCharacter) {
        this.a = fromCharacter;
        this.b = toCharacter;
    }

    public String change(String characterString) {
        return characterString.replace(a, b);

    }
}
