package immutarefbank;

public class SSN {
    
    // private and final surely means no one can touch this... maybe?
    private final char[] digits;
    
    public SSN(char[] digits) {
        this.digits = digits;
    }

    /**
     * Returns digits of the SSN.
     * 
     * CALLER MAY NOT MODIFY THE RETURNED ARRAY!
     */
    public char[] getValue() {
        return digits;
    }
}
