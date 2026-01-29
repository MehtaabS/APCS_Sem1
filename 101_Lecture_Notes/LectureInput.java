/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        double curry=11.99;
        double butter=19.99;
        double chai=9.99;
        double bri=20.99;
        
        System.out.println("Welcome to the Mehtaab's Top Goat");
        System.out.println("Here's our menu:");
        System.out.println("1. 🍛Chicken curry🍛-"+curry);
        System.out.println("2.😋Butter chicken😋(Best option)-"+butter);
        System.out.println("3.🥘Chai tea🥘-"+chai);
        System.out.println("4.🍲Briyani🍲-"+bri);
        System.out.println("");
        System.out.println("What's the name for your order?");
        String name=sc.nextLine();
        System.out.println();
        System.out.println("How many Chicken Currys would you like?");
        int quantity1=sc.nextInt();
        System.out.println("How many Butter Chickens would you like?");
        int quantity2=sc.nextInt();
        System.out.println("How many Chai teas would you like?");
        int quantity3=sc.nextInt();
        System.out.println("How many briyanis would you like?");
        int quantity4=sc.nextInt();
        
        double total1=curry*quantity1;
        double total2=butter*quantity2;
        double total3=chai*quantity3;
        double total4=bri*quantity4;
        double total=total1+total2+total3+total4;
        System.out.println();
        System.out.println("Your total is: $" + total);
        System.out.println("How much would you like to tip?");
        double tipPercent = sc.nextDouble();
        double tip=total*(tipPercent/100);
        double grandTotal=tip+total;
        System.out.println(quantity1+"x Chicken Curry = "+ total1);
        System.out.println(quantity2+"x Butter Chicken = "+ total2);
        System.out.println(quantity3+"x Chai tea = "+ total3);
        System.out.println(quantity4+"x Briyani = "+ total4);
        System.out.println("Tip " + tipPercent"=" +tip);
	}
}
