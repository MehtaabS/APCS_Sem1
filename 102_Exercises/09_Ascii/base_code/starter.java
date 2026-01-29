import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a category (animal, object, face): ");
        String word = sc.nextLine();

        if (word.equals("animal")) {
            System.out.println(" /\\_./\\");
            System.out.println("( o_O )");
            System.out.println(" > ^  <");
        } else if (word.equals("object")) {
            System.out.println("  ____");
            System.out.println(" /    \\");
            System.out.println("|  o |");
            System.out.println(" \\__ /"); 
        } else if (word.equals("face")) {
            System.out.println("  ^ ^");
            System.out.println(" (O o)");
            System.out.println("  |__|");
        } else {
            System.out.println("Invalid choice! Pick animal, object, or face.");
        }
    }
}
