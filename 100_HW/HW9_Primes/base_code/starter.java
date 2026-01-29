import java.util.Scanner;
public class starter {
    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        }
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i = i + 1;
        }
        return true;
    }
    public static void printPrimes(int max) {
        int number = 2;
        while (number < max) {
            if (checkPrime(number)) {
                System.out.println(number);
            }
            number = number + 1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number and we'll print out every prime until that number ");
        int num = scanner.nextInt();
        printPrimes(num);
        
    }
}
