import java.util.Scanner;
import java.util.Random;
public class starter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int money=100;
        while(money>0){
            System.out.println("You have $"+money);
            System.out.print("Enter your wager: ");
            int wager=sc.nextInt();
            sc.nextLine();
            if(wager>money||wager<=0){
                System.out.println("Invalid wager.");
            }
            else{
                int a=rand.nextInt(10);
                int b=rand.nextInt(10);
                int c=rand.nextInt(10);
                System.out.println("Roll: "+a+" "+b+" "+c);
                if(a==b&&b==c){
                    money+=wager*3;
                    System.out.println("JACKPOT! Triple your wager!");
                }
                else if(a==b||a==c||b==c){
                    money+=wager*2;
                    System.out.println("Nice! Two numbers match, double your wager!");
                }
                else{
                    money-=wager;
                    System.out.println("No match, you lose your wager.");
                }
                if(money<=0){
                    System.out.println("You ran out of money!");
                    break;
                }
                System.out.print("Do you want to play again? (Yes/No): ");
                String ans=sc.nextLine();
                if(!(ans.equals("Yes")||ans.equals("yes")||ans.equals("Y")||ans.equals("y")))
                    break;
            }
        }
        System.out.println("Game over! You leave with $"+money);
    }
}
