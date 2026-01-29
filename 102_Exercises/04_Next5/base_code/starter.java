import java.util.Scanner;

public class  starter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an number: ");
        int num = scanner.nextInt();

        System.out.println("Next 5 numbers of "+num);
        System.out.println(num);
        System.out.println(num + 1);
        System.out.println(num + 2);
        System.out.println(num + 3);
        System.out.println(num + 4);
        System.out.println(num + 5);

        System.out.println("Next 5 multiples:");
        System.out.println(num * 1);
        System.out.println(num * 2);
        System.out.println(num * 3);
        System.out.println(num * 4);
        System.out.println(num * 5);
        System.out.println(num * );

        System.out.println("Divided by 100: " + (num / 100.0));
        System.out.println("Divided by 10: " + (num / 10.0));
    }
}
