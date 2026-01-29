import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("enter second number: ");
        int num2 = sc.nextInt();

      
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even");
        } else {
            System.out.println(num1 + " is odd");
        }

        if (num1 % 3 == 0) {
            if (num1 % 4 == 0) {
                if (num1 % 5 == 0) {
                    System.out.println(num1 + " is divisible by 3, 4, and 5");
                } else {
                    System.out.println(num1 + " is not divisible by 3, 4, and 5");
                }
            } else {
                System.out.println(num1 + " is not divisible by 3, 4, and 5");
            }
        } else {
            System.out.println(num1 + " is not divisible by 3, 4, and 5");
        }

       
        if (num2 % 2 == 0) {
            System.out.println(num2 + " is even");
        } else {
            System.out.println(num2 + " is odd");
        }

        if (num2 % 3 == 0) {
            if (num2 % 4 == 0) {
                if (num2 % 5 == 0) {
                    System.out.println(num2 + " is divisible by 3, 4, and 5");
                } else {
                    System.out.println(num2 + " is not divisible by 3, 4, and 5");
                }
            } else {
                System.out.println(num2 + " is not divisible by 3, 4, and 5");
            }
        } else {
            System.out.println(num2 + " is not divisible by 3, 4, and 5");
        }
    }
}
