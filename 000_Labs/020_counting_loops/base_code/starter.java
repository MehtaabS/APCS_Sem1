import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("How many times should I print your name? ");
        int times = sc.nextInt();

        int i = 0;
        while (i < times) {
            System.out.println(name);
            i++;
        }
    }
}
