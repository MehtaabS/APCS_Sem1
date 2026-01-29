import java.util.*;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a word.");
        String word = sc.nextLine();
        int size = word.length() + 5;
        String[][] board = new String[size][size];
        String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
        for(int r = 0; r < size; r++) {
            for(int c = 0; c < size; c++) {
                board[r][c] = letters[(int)(Math.random() * 26)];
            }
        }
        int row = (int)(Math.random() * size);
        int col = (int)(Math.random() * (size - word.length()));
        for(int i = 0; i < word.length(); i++) {
            board[row][col + i] = word.substring(i, i + 1);
        }
        for(int r = 0; r < size; r++) {
            for(int c = 0; c < size; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}
