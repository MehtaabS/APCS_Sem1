import java.util.*;
import pkg.*;

class starter {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Colors.println("Please enter a difficulty level: 1, 2, or 3");
        int d = s.nextInt();
        s.nextLine();

        if(d == 1){
            int c = 1;
            while(true){
                String[] w = new String[c];
                for(int i = 0; i < c; i++){
                    w[i] = getColorWord();
                }

                countdown();

                for(int i = 0; i < 20; i++){
                    Colors.println();
                }

                Colors.println("Enter the words in order:");
                boolean correct = true;
                for(int i = 0; i < c; i++){
                    if(!s.nextLine().equals(w[i])){
                        correct = false;
                        break;
                    }
                }

                if(correct){
                    Colors.println("Congrats! Next round!!");
                    c++;
                }
                else{
                    Colors.println("You got it wrong! Correct words were:");
                    for(int i = 0; i < c; i++){
                        Colors.println(w[i]);
                    }
                    break;
                }
            }
        }
        else if(d == 2){
            int c = 1;
            while(true){
                String[] w = new String[c];
                String[] t = new String[c];
                for(int i = 0; i < c; i++){
                    w[i] = getColorWord();
                    t[i] = getColorWord();
                }

                countdown();

                for(int i = 0; i < 20; i++){
                    Colors.println();
                }

                boolean correct = true;
                for(int i = 0; i < c; i++){
                    boolean checkText = Math.random() < 0.5;
                    if(checkText){
                        Colors.println("Enter the word:");
                        if(!s.nextLine().equals(w[i])){
                            correct = false;
                            break;
                        }
                    }
                    else{
                        Colors.println("Enter the text color:");
                        if(!s.nextLine().equals(t[i])){
                            correct = false;
                            break;
                        }
                    }
                }

                if(correct){
                    Colors.println("Congrats! Next round!!");
                    c++;
                }
                else{
                    Colors.println("You got it wrong!");
                    Colors.println("Words:");
                    for(int i = 0; i < c; i++){
                        Colors.println(w[i]);
                    }
                    Colors.println("Text Colors:");
                    for(int i = 0; i < c; i++){
                        Colors.println(t[i]);
                    }
                    break;
                }
            }
        }
        else if(d == 3){
            int c = 1;
            while(true){
                String[] w = new String[c];
                String[] t = new String[c];
                String[] b = new String[c];
                for(int i = 0; i < c; i++){
                    w[i] = getColorWord();
                    t[i] = getColorWord();
                    b[i] = getColorWord();
                }

                countdown();

                for(int i = 0; i < 20; i++){
                    Colors.println();
                }

                boolean correct = true;
                for(int i = 0; i < c; i++){
                    int choice = (int)(Math.random() * 3);
                }
            }
        }
