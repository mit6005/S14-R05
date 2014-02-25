package immutarefbank;

public class Customer {
    
    private final String name;
    private final SSN ssn;
    
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
