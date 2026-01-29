import pkg.*;
import java.util.*;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which account would you like to make? (no info, just name, name and an initial deposit)");
        String bankacc = sc.nextLine();

        double ideposit = 0;

        if (bankacc.equals("no info")) {
            BankAccount x = new BankAccount();
            x.displayAccountInfo();
        }
        else if (bankacc.equals("just name")) {
            System.out.println("What's your name?");
            String name = sc.nextLine();
            BankAccount w = new BankAccount(name);
            w.displayAccountInfo();
        }
        else if (bankacc.equals("name and an initial deposit")) {
            System.out.println("What's your name?");
            String name0 = sc.nextLine();

            System.out.println("What's your initial deposit?");
            ideposit = sc.nextDouble();
            sc.nextLine(); // consume newline

            BankAccount z = new BankAccount(name0, ideposit);
            z.displayAccountInfo();
        }

        System.out.println("Would you like to check your balance of this account? (yes/no)");
        String checkacc = sc.nextLine();

        if (checkacc.equals("yes")) {
            System.out.println("Balance : $" + ideposit);
            System.out.println("Thank you for your business!");
        } 
        else {
            System.out.println("Thank you for your business!");
        }
    }
}
