import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int l = a;
        if (b > l) {
            l = b;
        }
        if (c > big) {
            l = c;
        }
        if (a > big) {
            l = a;
        }
        int s = a;
        if (b < s) {
            s = b;
        }
        if (c < s) {
            s = c;
        }
        if (a < s) {
            s = a;
        }
        System.out.println("Largest: " + l);
        System.out.println("Smallest: " + s);
    }
}
