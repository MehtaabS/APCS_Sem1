import java.util.Scanner;

class starter {
    public static int pow(int x, int y) {
        int result = 1;
        int count = 0;
        while(count < y) {
            result = result * x;
            count = count + 1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number");
        int x = sc.nextInt();
        System.out.println("Give me a 2nd number");
        int y = sc.nextInt();
        System.out.println(pow(x, y));
    }
}
