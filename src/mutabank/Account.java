package mutabank;

public class Account {
    
    private Customer owner;
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
