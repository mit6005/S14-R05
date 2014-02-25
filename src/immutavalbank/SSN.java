package immutavalbank;

public class SSN {
    
    // private, final, and immutable
    private final String digitsString;
    // or:
    // private final List<Character> digitsList;
    
    public SSN(char[] digits) {
        this.digitsString = new String(digits);
        // or:
        // List<Character> digitsList = new ArrayList<Character>();
        // this.digitsList = Collections.unmodifiableList(digitsList);
        // for (char digit : digits) { digitsList.add(digit); }
    }

    public String getValue() {
        return digitsString;
        // or, return List<Character> and:
        // return digitsList;
    }
}
