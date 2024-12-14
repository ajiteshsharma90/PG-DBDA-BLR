/*4) Simple Banking System:
Implement a simple banking system that allows a user to deposit, withdraw, and check their balance.
Use conditional statements to check for sufficient funds during withdrawal.*/
import java.util.Scanner;
public class q4 {
    public static double balance = 0;

    public static void check(){
        System.out.println("Your Balance is "+balance);
    }
    public static void deposit (){
        Scanner s = new Scanner(System.in);
        System.out.println("Deposit Amount: ");
        double amount = s.nextDouble();
        if (amount < 0)
            System.out.println("Enter an amount greater than 0");
        else{
            balance = amount + balance;
            System.out.println(amount+" has been deposited");
        }
    }

    public static void withdraw() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter withdrawal amount: ");
        double amount = s.nextDouble();
        if (balance > amount) {
            balance = balance - amount;
            System.out.println(amount + " has been withdrawn");
        }
        else{
            System.out.println("Insufficient Balance");
        }

    }

    public static int menu(Scanner s){


        System.out.println("Please select an Operation: ");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check your Balance");
        System.out.println("4. Exit");
        int choice = s.nextInt();
        return choice;
    }



    public static void main(String[] args)
    {
        System.out.println("\nWelcome to Bank :)");
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            choice = menu(s) ;
            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    check();
                    break;
                case 4:
                    break;
            }
        } while ( choice != 4);
        s.close();

    }
}
