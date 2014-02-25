package mutabank;

public class Main {
    
    /**
     * Return a short summary of the account, with SSN masked for security.
     */
    private static String accountSummary(Account acct) {
        String dollars = "$" + acct.getBalance();
        Customer owner = acct.getOwner();
        return dollars + " " + owner.getName() + " (" + maskedSSN(owner.getSSN()) + ")";
    }
    
    /**
     * Return a Social Security number with the first 5 digits masked out.
     */
    private static String maskedSSN(SSN ssn) {
        char[] digits = ssn.getValue();
        for (int ii = 0; ii < 5; ii++) {
            digits[ii] = 'X';
        }
        return new String(digits);
    }

    public static void main(String[] args) {
        
        // set up Frank's account
        
        SSN franksSSN = new SSN(new char[] { '0', '7', '8', '0', '5', '1', '1', '2', '0' });
        Customer frank = new Customer("Frank", franksSSN);
        Account acct = new Account(frank, 100);
        
        // print out an account summary
        System.out.println(accountSummary(acct));
        
        // ...
        
        // by the way, what's Frank's SSN?
        System.err.println(frank.getSSN().getValue());
    }
}
