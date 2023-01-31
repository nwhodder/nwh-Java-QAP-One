package Account;

import java.text.NumberFormat;


public class Account {
    private String id;
    private String name;
    private int balance;
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance += amount;
        return getBalance();
    }

    public int debit(int amount){
        if(amount <= balance){
            balance -= amount;
        }else {
            System.out.println("Amount Exceeded Balance");
        }
        return getBalance();
    }

    public int transferTo(Account recipient, int amount){
        if(amount <= balance){
            debit(amount);
            recipient.credit(amount);
        }else {
            System.out.println("Amount Exceeded Balance");
        }
        return getBalance();
    }

    public String toString(){
        return String.format("Account: %s%nName: %s%nBalance: %s%n", id, name, fmt.format(balance));
    }


}// End of Class
