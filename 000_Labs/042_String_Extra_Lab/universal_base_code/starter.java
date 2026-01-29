import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String s = sc.nextLine();
        System.out.println("Original: " + s);
        String rev = "";
        while (s.length() > 0) {
            int pos = s.indexOf(" ");
            if (pos == -1) {
                if (rev.length() == 0) {
                    rev = s;
                } 
                else {
                    rev = s + " " + rev;
                }
                s = "";
            } 
            else {
                String word = s.substring(0, pos);
                if (rev.length() == 0) {
                    rev = word;
                } 
                else {
                    rev = word + " " + rev;
                }
                s = s.substring(pos + 1);
            }
        }
        System.out.println("Reversed: " + rev);
    }
}
