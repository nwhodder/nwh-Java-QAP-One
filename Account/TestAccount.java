package Account;

public class TestAccount {

    public static void main(String[] args){
        Account accountOne = new Account("F032G", "Nick", 5000);
        System.out.println(accountOne.getBalance());

        Account accountTwo = new Account("C349B", "Kennedy", 4000);
        System.out.println(accountTwo.getBalance());

        accountOne.transferTo(accountTwo, 1000);

        System.out.println(accountOne.toString() +  accountTwo.toString());

    }

}