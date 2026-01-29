import java.util.Scanner;
import java.util.Random;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = (int)(Math.random() * 10);
        int x1 = (int)(Math.random() * 101);
        double x2 = (Math.random() * 1 + 2.5);
        int x3 = (int)(Math.random() * 576 +14 );

        System.out.println("a. " + x);
        System.out.println("b. " + x1);
        System.out.println("c. " + x2);
        System.out.println("d. " + x3);
    }
}
