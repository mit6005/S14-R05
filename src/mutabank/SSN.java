package mutabank;

public class SSN {
    
    // private means no one can touch this... maybe?
    private char[] digits;
    
    public SSN(char[] digits) {
        this.digits = digits;
    }

    public char[] getValue() {
        return digits;
    }
}
