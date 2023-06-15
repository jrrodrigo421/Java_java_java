public class Clients {

    String firstName;
    int age;
    int balance;

    private int teste = 0;

    Clients(){
        balance = 10;
    }

    void newAccount(){
        System.out.println(firstName + " Account Created! ");
        System.out.println("The new balance is "+ balance +"$");
    }
}
