import java.util.*;    
import java.io.*;    
import java.time.*;      
import java.time.format.*; 

class starter {
    static long startTime = 0;
    static ArrayList<String> arr = new ArrayList<String>();

    public static void main(String args[]) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Type Quest!");
        System.out.println("It is currently " + getTime() + " and we're ready to play!");
        System.out.println("Given a sentence, type it as fast as possible!");
        System.out.println("------------------------------------------");
        System.out.println("Would you like to: ");
        System.out.println(" 1 - Play random \n 2 - Play set \n 3 - Quit");
        int type1 = sc.nextInt();
        sc.nextLine();

        if (type1 == 1) {
            System.out.println("You've chosen to randomly select a sentence.");
            System.out.println("-----------------Your sentence is:-----------------");
            String x = getSentence();
            System.out.println(x);
            System.out.println("------------------------------------------");
            countdown();
            startTimer();
            String type = sc.nextLine();

            double time = endTimer();
            System.out.println("Nice job! Here is your result!");
            System.out.println("This is how much time it took " + time + " seconds");
            System.out.println("Errors: " + compareSentences(type, x) + "/" + wordsInSentence(x) + " letters");
            System.out.println((lettersInSentence(type) / time) * 60 + " letters per minute");
            System.out.println((wordsInSentence(type) / time) * 60 + " words per minute");

        } else if (type1 == 2) {
            System.out.println("Please enter what number sentence you'd like to play:");
            int type2 = sc.nextInt();
            String rneef = sc.nextLine();
            System.out.println("-----------------Your sentence is:-----------------");
            String y = getSentence(type2);
            System.out.println(y);
            System.out.println("------------------------------------------");
            countdown();
            startTimer();
            String type = sc.nextLine();

            double time = endTimer();
            System.out.println("Nice job! Here is your result!");
            System.out.println("This is how much time it took " + time + " seconds");
            System.out.println("Errors: " + compareSentences(type, y) + "/" + wordsInSentence(y) + " letters");
            System.out.println((lettersInSentence(type) / time) * 60 + " letters per minute");
            System.out.println((wordsInSentence(type) / time) * 60 + " words per minute");

        } else if (type1 == 3) {
            return;
        }
    } // <-- main method ends here

    // All methods below are now correctly inside the class
    public static String getTime() {
        LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
    }

    public static void startTimer() {
        startTime = System.nanoTime();
    }

    public static double endTimer() throws InterruptedException {
        long endTime = System.nanoTime();
        long timeSeconds = ((endTime - startTime) / 1000000);
        double decSeconds = timeSeconds / 1000.0;
        return decSeconds;
    }

    public static void countdown() {
        System.out.println("Starting countdown...");
        for (int i = 0; i < 3; i++) {
            System.out.println(3 - i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Go!");
    }

    private static void populateArrayList() {
        File f = new File("sentences.txt");
        try (Scanner fsc = new Scanner(f)) {
            while (fsc.hasNextLine()) {
                arr.add(fsc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    public static String getSentence() {
        populateArrayList();
        int rand = (int) (Math.random() * 100);
        return arr.get(rand);
    }

    public static String getSentence(int index) {
        populateArrayList();
        return arr.get(index % 100);
    }

    public static int lettersInSentence(String sent) {
        return sent.length();
    }

    public static int wordsInSentence(String sent) {
        int spaceCount = 0;
        while (sent.indexOf(" ") > -1) {
            spaceCount++;
            sent = sent.substring(sent.indexOf(" ") + 1);
        }
        return ++spaceCount;
    }

    public static int compareSentences(String given, String typed) {
        int errors = 0;
        while (given.length() > 0 && typed.length() > 0) {
            if (!given.substring(0, 1).equals(typed.substring(0, 1)))
                errors++;
            given = given.substring(1);
            typed = typed.substring(1);
        }
        return errors;
    }
} // <-- class ends here
