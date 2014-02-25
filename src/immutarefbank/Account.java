package immutarefbank;

public class Account {
    
    private final Customer owner;
    private int balance;
    
    public Account(Customer owner, int initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public Customer getOwner() {
        return owner;
    }
    
    public int getBalance() {
        return balance;
    }
}
