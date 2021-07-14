package store_system;

import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    //Variables
    int prevTransaction;
    String cart;
    String name;
    int balance;
    int ID;

    static final String menuOptions = "\n1. View Shop" +
    "\n2. View Balance" +
    "\n3. About" +
    "\n4. Exit";

    //Constructing class
    Account(String name, int balance, int ID){
        this.name = name;
        this.balance = balance;
        this.ID = ID;
    }
    //Menu
    void menu(){
        int selection;
        System.out.println("Welcome " + name + " to the digital store!");
        System.out.println("Users ID: " + ID);
        System.out.println(menuOptions);

        do{
            System.out.println();
            System.out.println("Input you're selection: ");
            selection = sc.nextInt();
            System.out.println();

            switch(selection){
                //View items
                case 1:
                itemsList();
                break;
                //View Balance
                case 2:
                showBalance();
                break;
                //About
                case 3:
                about();
                break;
                //Exit
                case 4:
                break;
                //Invalid Input
                default:
                System.out.println("Invalid input ~ Please input 1, 2, 3, 4 or 5.");
                break;
            }
        }while(selection != 4);
        System.out.println("Thankyou for shopping with us " + name + "!");
    }
    //Items
    items TP = new items("Toilet Paper", 5);
    items SVL = new items("Shovel", 10);
    items SPK = new items("Speakers", 25);
    items MATT = new items("Mattress", 50);
    items AIR = new items("Airpods", 100);

    static class items{
        String itemName;
        int itemPrice;

        items(String name, int price){
            this.itemName = name;
            this.itemPrice = price;
        }
    }
    //SHOP
    private void itemsList(){
        int itemOption;
        System.out.println("1. " + TP.itemName + " $" + TP.itemPrice);
        System.out.println("2. " + SVL.itemName + " $" + SVL.itemPrice);
        System.out.println("3. " + SPK.itemName + " $" + SPK.itemPrice);
        System.out.println("4. " + MATT.itemName + " $" + MATT.itemPrice);
        System.out.println("5. " + AIR.itemName + " $" + AIR.itemPrice);
        System.out.println("6. Exit Shop");
        do{
            System.out.println();
			System.out.println("Enter an option: ");
            itemOption = sc.nextInt();
            System.out.println();

            switch(itemOption){
                //Toilet paper
                case 1:
                if(balance > TP.itemPrice){
                    balance -= TP.itemPrice;
                    System.out.println(TP.itemName + " purchased.");
                } else{
                    System.out.println("Insufficient balance.");
                }
                break;
                //Shovel
                case 2:
                if(balance > SVL.itemPrice){
                    balance -= SVL.itemPrice;
                    System.out.println(SVL.itemName + " purchased.");
                } else{
                    System.out.println("Insufficient balance.");
                }
                break;
                //Speaker
                case 3:
                if(balance > SPK.itemPrice){
                    balance -= SPK.itemPrice;
                    System.out.println(SPK.itemName + " purchased.");
                } else{
                    System.out.println("Insufficient balance.");
                }
                break;
                //Mattress
                case 4:
                if(balance > MATT.itemPrice){
                    balance -= MATT.itemPrice;
                    System.out.println(MATT.itemName + " purchased.");
                } else{
                    System.out.println("Insufficient balance.");
                }
                break;
                //Airpods
                case 5:
                if(balance > AIR.itemPrice){
                    balance -= AIR.itemPrice;
                    System.out.println(AIR.itemName + " purchased.");
                } else{
                    System.out.println("Insufficient balance.");
                }
                break;
                //Exit
                case 6:
                break;
                //Invalid input
                default:
                System.out.println("Invalid Input ~ Please input 1, 2, 3, 4 or 5.");
                break;
            }
        }while(itemOption != 6);
        System.out.println("Thankyou for shopping with us!");
        //Print Menu
        System.out.println(menuOptions);
    }

    //Show balance
    private void showBalance(){
        System.out.println("Current balance: $" + balance);
        //Print Menu
        System.out.println(menuOptions);
    }

    //About
    private void about(){
        System.out.println("Welcome to the digital store! " + 
        "\nThis program was completely written in Java for learning purposes! " + 
        "\nFeel free to improve/add to my code.");
        //Print Menu
        System.out.println(menuOptions);
    }
}