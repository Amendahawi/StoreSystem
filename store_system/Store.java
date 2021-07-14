package store_system;
import java.util.Scanner;
public class Store {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Create an account!");

        System.out.println("Enter username: ");
        String username = sc.next();

        System.out.println("Enter desired balance: ");
        int balance = sc.nextInt();
        
        System.out.println("Enter desired ID: (4 digits) ");
        int ID = sc.nextInt();

        while(Integer.toString(ID).length() != 4){
            System.out.println("ID must be 4 digits.");
            System.out.println();
            System.out.println("Enter desired ID: (4 digits) ");
            ID = sc.nextInt();
        }
        Account user = new Account(username, balance, ID);
        user.menu();
        sc.close();
    }
}
