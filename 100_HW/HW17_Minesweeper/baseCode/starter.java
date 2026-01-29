import java.util.*;

class starter{
    public static void main(String[] args){
        System.out.println("Welcome to Minesweeper!");
        System.out.println("On the grid, 9 means untouched space.");
        System.out.println("Any other number means how many bombs are adjacent to the square.");
        System.out.println("Clear all empty spots and don't touch the bombs!");
        System.out.println();
        
        System.out.println("How difficult would you like the game?");
        System.out.println("1 - Easy (10 bombs)");
        System.out.println("2 - Medium (25 bombs)");
        System.out.println("3 - Hard (40 bombs)");
        System.out.println("4 - Impossible (99 bombs)");
        
        Scanner sc = new Scanner(System.in);
        int diff = sc.nextInt();
        
        int[][] guessGrid = new int[10][10];
        for(int i = 0; i < guessGrid.length; i++){
            for(int j = 0; j < guessGrid[0].length; j++){
                guessGrid[i][j] = 9;
            }
        }
        
        int[][] bombProxGrid = new int[10][10];
        mapSetUp(diff, bombProxGrid);
        printGrid(guessGrid);
        System.out.println("-------------------------------------");

        while(true){
            System.out.print("Please enter a row: ");
            int r = sc.nextInt();
            System.out.print("Please enter a col: ");
            int c = sc.nextInt();
            
            if(move(r, c, bombProxGrid)){           
                System.out.println("-------------------------------------");
                System.out.println("You've hit a bomb! Better luck next time!");
                printGrid(bombProxGrid);
                break;
            }

            reveal(r, c, guessGrid, bombProxGrid);
            System.out.println("-------------------------------------");

            if(checkWin(guessGrid, bombProxGrid)){
                System.out.println("You won! Congratz!");
                break;
            }
        }
    }
    
    public static void mapSetUp(int diff, int [][] bombProxGrid){
        int bombs = 0;
        if(diff == 1){
            bombs = 10;
        } else if(diff == 2){
            bombs = 25;
        } else if(diff == 3){
            bombs = 40;
        } else if(diff == 4){
            bombs = 99;
        }

        int placed = 0;
        while(placed < bombs){
            for(int i = 0; i < bombProxGrid.length; i++){
                for(int j = 0; j < bombProxGrid[0].length; j++){
                    if(placed < bombs && bombProxGrid[i][j] != 9){
                        int chance = (int)(Math.random() * 10);
                        if(chance == 0){
                            bombProxGrid[i][j] = 9;
                            placed++;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < bombProxGrid.length; i++){
            for(int j = 0; j < bombProxGrid[0].length; j++){
                if(bombProxGrid[i][j] == 9){
                    addAdj(i, j, bombProxGrid);
                }
            }
        }
    }
    
    public static void addAdj(int r, int c, int [][] bombProxGrid){
        for(int i = r - 1; i <= r + 1; i++){
            for(int j = c - 1; j <= c + 1; j++){
                if(i >= 0 && i < bombProxGrid.length &&
                   j >= 0 && j < bombProxGrid[0].length &&
                   bombProxGrid[i][j] != 9){
                    bombProxGrid[i][j]++;
                }
            }
        }
    }
    
    public static boolean move(int r, int c, int [][] bombProxGrid){
        if(bombProxGrid[r][c] == 9){
            return true;
        }
        return false;
    }
    
    public static void reveal(int r, int c, int [][] guessGrid, int[][] bombProxGrid){
        for(int i = r - 1; i <= r + 1; i++){
            for(int j = c - 1; j <= c + 1; j++){
                if(i >= 0 && i < guessGrid.length &&
                   j >= 0 && j < guessGrid[0].length){
                    guessGrid[i][j] = bombProxGrid[i][j];
                }
            }
        }
        printGrid(guessGrid);
    }
    
    public static boolean checkWin(int [][] guessGrid, int [][] bombProxGrid){
        for(int i = 0; i < guessGrid.length; i++){
            for(int j = 0; j < guessGrid[0].length; j++){
                if(bombProxGrid[i][j] != 9 && guessGrid[i][j] == 9){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void printGrid(int [][] board){
        System.out.println("_________________________________________");
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[0].length;j++){
                System.out.print("| " + board[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("_________________________________________");
    }
}
