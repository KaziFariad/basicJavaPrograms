public class Application {
    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthew's Account", 1000);
        Account myAccount = new Account("Kazi's Account", 0);

        System.out.println(matthewsAccount);
        System.out.println(myAccount);

        matthewsAccount.withdraw(100.0);
        myAccount.deposit(100.0);

        System.out.println(matthewsAccount);
        System.out.println(myAccount);


        Student matt = new Student();
        matt.play();

        System.out.println(matt.getCredits());

    }
}
