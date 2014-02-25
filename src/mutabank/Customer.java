package mutabank;

public class Customer {
    
    private String name;
    private SSN ssn;
    
    public Customer(String name, SSN ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }
    
    public SSN getSSN() {
        return ssn;
    }
}
