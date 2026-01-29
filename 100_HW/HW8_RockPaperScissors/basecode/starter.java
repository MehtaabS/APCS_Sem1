/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Would you like to play the computer? (yes/no/done)");
            String choice = sc.nextLine();
            if (choice.equals("yes"))
            {
                System.out.println("\n--------------------------------------------------------------");
                String play;
                while(true){
                    System.out.println("Please enter rock/paper/scissors:");
                    play = sc.nextLine();
                    if (play.equals("rock")||play.equals("paper")||play.equals("scissors"))
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Invalid input, please type in rock/paper/scissors:");
                    }
                }
                int winner = compare2(play,getObject());
                if (winner == 0)
                {
                    System.out.println("You tied!");
                    System.out.println("\n--------------------------------------------------------------");
                }
                else if (winner == 1)
                {
                    System.out.println("You won!!!");
                    System.out.println("\n--------------------------------------------------------------");
                }
                else
                {
                    System.out.println("You lost! :(");
                    System.out.println("\n--------------------------------------------------------------");
                }
                
            
            }
            else if (choice.equals("no"))
            {
                int wins_1 = 0;
                int wins_2 = 0;
                int ties = 0;
                int counter = 0;
                System.out.println("\n--------------------------------------------------------------");
                System.out.println("How many times would you like the computer to play itself?");
                int num = sc.nextInt();
                sc.nextLine();
                while (counter<num)
                {
                    int check = compare2(getObject(),getObject());
                    if (check == 0){
                        ties ++;
                    }
                    else if (check == 1){
                        wins_1++;
                    }
                    else{
                        wins_2 ++;
                    }
                    counter ++;
                }
                System.out.println("Player 1 wins: "+wins_1);
                System.out.println("Player 2 wins: "+wins_2);
                System.out.println("Ties: "+ties);
                System.out.println("\n--------------------------------------------------------------");
            }
            else if (choice.equals("done"))
            {
                System.out.println("\n--------------------------------------------------------------");
                System.out.println("Thanks for playing!");
                break;
            }
            else
            {
                System.out.println("\n--------------------------------------------------------------");
                System.out.println("You typed an invalid input!");
            }
        }
    }
    public static String getObject(){
        int random = (int)(Math.random()*3);
        // 0 = rock
        // 1 = papers
        // 2 = scissors
        if (random == 0){
            return "rock";
        }
        else if (random == 1){
            return "papers";
        }
        else{
            return "scissors";
        }
    }
    public static int compare2(String player1, String player2){
        if (player1.equals("rock")&&player2.equals("rock")||player1.equals("paper")&&player2.equals("paper")||player1.equals("scissors")&&player2.equals("scissors"))
        {
            return 0;
        }
        if((player1.equals("rock") && player2.equals("scissors"))||(player1.equals("paper") && player2.equals("rock"))||(player1.equals("scissors") && player2.equals("paper")))
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }
}
