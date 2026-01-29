import java.util.Scanner;
public class starter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String t = s.nextLine();
        String r = "";
        while (t.indexOf(" ") != -1) {
            int p = t.indexOf(" ");
            String w = t.substring(0, p);
            r += pig(w) + " ";
            t = t.substring(p + 1);
        }
        r += pig(t);
        System.out.println("Pig Latin: " + r);
    }
    public static String pig(String x) {
        if (vowel(x.substring(0, 1))){
            return x + "way";
        }
        else if (!vowel(x.substring(0, 1)) && vowel(x.substring(1, 2))){
            return x.substring(1) + x.substring(0, 1) + "ay";
        }
        else{
            return x.substring(2) + x.substring(0, 2) + "ay";
        }
    }
    public static boolean vowel(String y) {
        return y.equalsIgnoreCase("a")
            || y.equalsIgnoreCase("e")
            || y.equalsIgnoreCase("i")
            || y.equalsIgnoreCase("o")
            || y.equalsIgnoreCase("u");
    }
}
