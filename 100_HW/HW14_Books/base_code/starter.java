import java.util.*;
import java.io.*;

class starter {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the file name of one of the text files in the 'books' folder: (Ex: test.txt)");
        String textFile = sc.nextLine();
        String[] arr = fillArray(textFile);
        System.out.println();

        while(true){
            System.out.println("What action would you like to take?");
            System.out.println("1. Check text file (file)");
            System.out.println("2. Print the text given (print)");
            System.out.println("3. Print the text backwards (printBack)");
            System.out.println("4. Print a certain number of words (printNum)");
            System.out.println("5. Change the text file (change)");
            System.out.println("6. Check the number of words in a text (check)");
            System.out.println("7. Most common word (common)");
            String choice = sc.nextLine();
            System.out.println();

            if(choice.equals("file") || choice.equals("1")) {
                System.out.println("Current file: " + textFile);
            }
            else if(choice.equals("print") || choice.equals("2")) {
                printsArray(arr);
            }
            else if(choice.equals("printBack") || choice.equals("3")) {
                printsArrayBack(arr);
            }
            else if(choice.equals("printNum") || choice.equals("4")) {
                System.out.println("How many words would you like to print?");
                int num = sc.nextInt();
                sc.nextLine();
                printsNumber(arr, num);
            }
            else if(choice.equals("change") || choice.equals("5")) {
                System.out.println("Enter file name: ");
                textFile = sc.nextLine();
                arr = fillArray(textFile);
                System.out.println("File changed successfully.");
            }
            else if(choice.equals("check") || choice.equals("6")) {
                System.out.println("Enter the word you want to check: ");
                String word = sc.nextLine();
                System.out.println("The word '" + word + "' occurs " + checksArray(arr, word) + " times.");
            }
            else if(choice.equals("common") || choice.equals("7")) {
                System.out.println("The most common word is: " + mostCommon(arr));
            }
            else {
                System.out.println("Invalid choice, try again.");
            }

            System.out.println("----------");
        }
    }

    public static void printsArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void printsArrayBack(String[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
       
    }

    public static void printsNumber(String[] arr, int num){
        if(num > arr.length){
            System.out.println("The number is too large, try again.");
            return;
        }
        for(int i = 0; i < num; i++){
            System.out.print(arr[i]);
        }
        
    }

    public static int checksArray(String[] arr, String check){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(check)){
                count++;
            }
        }
        return count;
    }

    public static String mostCommon(String[] arr){
        String m = "";
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            String w = arr[i];
            int c = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j].equals(w)){
                    c++;
                }
            }
            if(c > max){
                max = c;
                m = w;
            }
        }
        return m;
    }

    public static String[] fillArray(String arg) throws FileNotFoundException {
        File text = new File("./books/" + arg);
        Scanner sc = new Scanner(text);
        int wordCount = 0;
        while(sc.hasNext()){
            sc.next();
            wordCount++;
        }

        String[] arr = new String[wordCount];
        sc = new Scanner(text);
        for(int i = 0; i < wordCount; i++){
            arr[i] = sc.next();
        }
        return arr;
    }
}
